package com.bilibili.mediautils;

import android.graphics.Point;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mediautils/ScaleUtils.class */
public class ScaleUtils {
    public static float findFittestAspectFillRatio(Point point, List<Point> list) {
        float f7;
        float f8 = point.x / point.y;
        int size = list.size();
        float[] fArr = new float[size];
        for (int i7 = 0; i7 < size; i7++) {
            fArr[i7] = list.get(i7).x / list.get(i7).y;
        }
        Arrays.sort(fArr);
        int i8 = 0;
        while (true) {
            if (i8 >= size) {
                f7 = -1.0f;
                break;
            }
            f7 = fArr[i8];
            if (f8 <= f7) {
                break;
            }
            i8++;
        }
        float f9 = f7;
        if (f7 == -1.0f) {
            f9 = fArr[size - 1];
        }
        return f9;
    }

    public static float findFittestAspectFitRatio(Point point, List<Point> list) {
        float f7;
        float f8 = point.x / point.y;
        int size = list.size();
        float[] fArr = new float[size];
        for (int i7 = 0; i7 < size; i7++) {
            fArr[i7] = list.get(i7).x / list.get(i7).y;
        }
        Arrays.sort(fArr);
        int i8 = size - 1;
        while (true) {
            if (i8 < 0) {
                f7 = -1.0f;
                break;
            }
            f7 = fArr[i8];
            if (f8 >= f7) {
                break;
            }
            i8--;
        }
        float f9 = f7;
        if (f7 == -1.0f) {
            f9 = fArr[0];
        }
        return f9;
    }
}
