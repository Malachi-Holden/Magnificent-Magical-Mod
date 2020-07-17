package com.malachiholden.magnificentmagicalmod;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import net.minecraft.util.math.shapes.IBooleanFunction;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import java.io.*;
import java.util.ArrayList;

public class VoxelShapeModel {

    public static VoxelShape fromModelJson(String modelJsonResourceName){
        try {
            ClassLoader classloader = Thread.currentThread().getContextClassLoader();
            InputStream is = classloader.getResourceAsStream(modelJsonResourceName);
            if (is == null) return null;
            ByteArrayOutputStream result = new ByteArrayOutputStream();
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) != -1) {
                result.write(buffer, 0, length);
            }
            Gson gson = new Gson();
            ModelJson modelJson = gson.fromJson(result.toString(), new TypeToken<ModelJson>(){}.getType());

            VoxelShape resultShape = VoxelShapes.empty();
            for (Element element: modelJson.elements){
                double x1 = element.from.get(0);
                double y1 = element.from.get(1);
                double z1 = element.from.get(2);
                double x2 = element.to.get(0);
                double y2 = element.to.get(1);
                double z2 = element.to.get(2);
                VoxelShape newShape = VoxelShapes.create(x1/16, y1/16, z1/16, x2/16, y2/16, z2/16);
                resultShape = VoxelShapes.combine(resultShape, newShape, IBooleanFunction.OR); // not sure about the third argument here
            }
            return resultShape;
        } catch (IOException e) {
            return null;
        }
    }

    private static class ModelJson{
        ArrayList<Element> elements;
    }
        private static class Element{
            ArrayList<Integer> from;
            ArrayList<Integer> to;
        }
}
