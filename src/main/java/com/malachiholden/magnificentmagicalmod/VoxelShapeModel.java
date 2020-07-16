package com.malachiholden.magnificentmagicalmod;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import net.minecraft.util.math.shapes.IBooleanFunction;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

public class VoxelShapeModel {

    public static VoxelShape fromModelJson(String modelJsonFileName){
        try {
            FileReader reader = new FileReader(modelJsonFileName);
            Gson gson = new Gson();
            ModelJson modelJson = gson.fromJson(reader, new TypeToken<ModelJson>(){}.getType());

            VoxelShape resultShape = VoxelShapes.empty();
            for (Element element: modelJson.elements){
                int x1 = element.from.get(0);
                int y1 = element.from.get(1);
                int z1 = element.from.get(2);
                int x2 = element.to.get(0);
                int y2 = element.to.get(1);
                int z2 = element.to.get(2);
                VoxelShape newShape = VoxelShapes.create(x1, y1, z1, x2, y2, z2);
                resultShape = VoxelShapes.combine(resultShape, newShape, IBooleanFunction.TRUE); // not sure about the third argument here
            }
            return resultShape;
        } catch (FileNotFoundException e) {
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
