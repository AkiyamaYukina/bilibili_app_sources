package com.bilibili.montage;

import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/montage/MontageLibChecker.class */
public class MontageLibChecker {
    public static List<String> CheckLibraryExistResult() {
        return MontageLibLoader.checkLibrary();
    }
}
