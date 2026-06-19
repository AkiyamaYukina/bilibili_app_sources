package com.bilibili.studio.material;

import com.bilibili.commons.io.FileUtils;
import com.bilibili.studio.material.MaterialType;
import com.bilibili.studio.material.internal.ProcessorItem;
import com.bilibili.studio.material.util.UtilsKt;
import java.io.File;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/material/a.class */
public final class a extends IStrategy<ProcessorItem> {
    @Override // com.bilibili.studio.material.IStrategy
    @Nullable
    public final Object action(@NotNull ProcessorItem processorItem, @NotNull MaterialConfig materialConfig, @NotNull Continuation<? super Unit> continuation) {
        String filePath = materialConfig.getFilePath();
        String fileName = processorItem.getRequest().getFileName();
        if (filePath == null || filePath.length() == 0 || fileName == null || fileName.length() == 0) {
            return Unit.INSTANCE;
        }
        String filePathNoEx = UtilsKt.getFilePathNoEx(fileName);
        File file = new File(filePath, filePathNoEx);
        if (!materialConfig.getUnZip() || !StringsKt.w(fileName, ".zip") || !file.exists()) {
            File file2 = new File(filePath, fileName);
            if (!file2.exists()) {
                return Unit.INSTANCE;
            }
            Result result = new Result(true, file2.getAbsolutePath(), fileName, 0.0d, null, null, null, false, null, null, 1016, null);
            result.setMaterialType(processorItem.getRequest().getMaterialType());
            result.setHit(true);
            processorItem.setResult(result);
            return Unit.INSTANCE;
        }
        BLog.e(UtilsKt.Material_TAG, "checkFile: " + file.getAbsolutePath());
        if (!UtilsKt.isFileExist(file)) {
            BLog.e(UtilsKt.Material_TAG, "delete empty dir: " + file.getAbsolutePath());
            FileUtils.deleteQuietly(file);
            return Unit.INSTANCE;
        }
        boolean getFinalDir = materialConfig.getGetFinalDir();
        String absolutePath = file.getAbsolutePath();
        String lastDirectoryPath = absolutePath;
        if (getFinalDir) {
            lastDirectoryPath = UtilsKt.getLastDirectoryPath(absolutePath, processorItem.getRequest().getDirFilterBlackList$resourcecenter_release());
        }
        Result result2 = new Result(true, lastDirectoryPath, filePathNoEx, 0.0d, null, null, null, false, null, null, 1016, null);
        result2.setMaterialType(processorItem.getRequest().getMaterialType());
        result2.setHit(true);
        processorItem.setResult(result2);
        try {
            Result.Companion companion = kotlin.Result.Companion;
            if (Intrinsics.areEqual(processorItem.getRequest().getMaterialType(), MaterialType.Transition.INSTANCE) || Intrinsics.areEqual(processorItem.getRequest().getMaterialType(), MaterialType.VideoAnimation.INSTANCE) || Intrinsics.areEqual(processorItem.getRequest().getMaterialType(), MaterialType.Flower.INSTANCE) || Intrinsics.areEqual(processorItem.getRequest().getMaterialType(), MaterialType.CaptionAnimation.INSTANCE)) {
                UtilsKt.printDirectoryContents$default(new File(processorItem.getResult().getFilePath()), "##", null, 4, null);
            }
            kotlin.Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = kotlin.Result.Companion;
            kotlin.Result.constructor-impl(ResultKt.createFailure(th));
        }
        return Unit.INSTANCE;
    }
}
