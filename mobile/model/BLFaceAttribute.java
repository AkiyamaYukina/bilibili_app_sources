package com.bilibili.mobile.model;

import G0.b;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mobile/model/BLFaceAttribute.class */
public class BLFaceAttribute {
    public Attribute[] arrayAttribute;
    public int attribute_count;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/mobile/model/BLFaceAttribute$Attribute.class */
    public static class Attribute {
        public String category;
        public String label;
        public float score;
    }

    public static String getFaceAttributeString(BLFaceAttribute bLFaceAttribute) {
        String str = null;
        String str2 = "";
        int i7 = 0;
        String str3 = "男";
        while (true) {
            Attribute[] attributeArr = bLFaceAttribute.arrayAttribute;
            if (i7 >= attributeArr.length) {
                StringBuilder sbA = b.a("颜值:", str, "  性别:", str3, "  年龄:");
                sbA.append(str2);
                return sbA.toString();
            }
            if (attributeArr[i7].category.equals("attractive")) {
                str = bLFaceAttribute.arrayAttribute[i7].label;
            }
            if (bLFaceAttribute.arrayAttribute[i7].category.equals("gender")) {
                str3 = bLFaceAttribute.arrayAttribute[i7].label.equals("male") ? "男" : "女";
            }
            if (bLFaceAttribute.arrayAttribute[i7].category.equals("age")) {
                str2 = bLFaceAttribute.arrayAttribute[i7].label;
            }
            i7++;
        }
    }
}
