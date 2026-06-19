package com.bilibili.studio.module.tuwen;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;
import androidx.annotation.MainThread;
import com.bilibili.studio.module.tuwen.callback.IBCutConfigAction;
import com.bilibili.studio.module.tuwen.callback.IBCutSoLoader;
import com.bilibili.studio.module.tuwen.callback.IBCutStep;
import com.bilibili.studio.module.tuwen.exception.BCutVideoException;
import com.bilibili.studio.module.tuwen.model.BCutCodecInfo;
import com.bilibili.studio.module.tuwen.model.BCutDraftInfo;
import com.bilibili.studio.module.tuwen.model.BCutRequestToDetail;
import com.bilibili.studio.module.tuwen.model.BCutVideoData;
import com.bilibili.studio.module.tuwen.model.BcutRequest;
import com.bilibili.studio.module.tuwen.model.PbEngineType;
import com.bilibili.studio.module.tuwen.model.PbMaterialRequest;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/module/tuwen/ITuwenPluginService.class */
public interface ITuwenPluginService {
    void addStepCallback(@NotNull IBCutStep iBCutStep);

    void cancelAITask(@NotNull String str);

    void cancelMaterialTasks();

    void cancelPreprocess(@Nullable Activity activity, @NotNull BcutRequest bcutRequest);

    void closeTemplateEditPage();

    @NotNull
    <T> String createAndLoopAITask(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull Class<T> cls, @NotNull Function1<? super String, Unit> function1, @NotNull Function3<? super String, ? super String, ? super T, Unit> function3, @NotNull Function3<? super String, ? super Integer, ? super String, Unit> function32);

    @NotNull
    FrameLayout createCollisionView(@NotNull Context context, @Nullable float[] fArr);

    void deleteDraft(int i7, @NotNull String str, @NotNull Function1<? super Boolean, Unit> function1);

    boolean destroyCollisionView(@NotNull FrameLayout frameLayout);

    boolean doBeforeLaunch(@NotNull Application application);

    void downloadPbMaterials(@NotNull List<PbMaterialRequest> list, @Nullable String str, @NotNull PbEngineType pbEngineType, @NotNull Function2<? super String, ? super String, Unit> function2, @NotNull Function2<? super String, ? super String, Unit> function22);

    void downloadPbTemplate(@NotNull List<String> list, @NotNull String str, @NotNull List<Integer> list2, @NotNull Function0<Unit> function0, @NotNull Function2<? super String, ? super String, Unit> function2);

    void downloadTemplate(@NotNull Activity activity, @NotNull BcutRequest bcutRequest, @Nullable Function2<? super Integer, ? super Integer, Unit> function2, @NotNull Function1<? super String, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12);

    void downloadTemplateAndPreprocess(@NotNull BcutRequest bcutRequest, @NotNull Function1<? super String, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12, @Nullable Function2<? super Integer, ? super Integer, Unit> function2);

    void enableHdr(boolean z6, boolean z7, float f7, boolean z8);

    @NotNull
    String getAuroraVersion();

    int getBuildVersion();

    @MainThread
    int getSupportAbility(@NotNull BcutRequest bcutRequest);

    void goToTemplateDetailPage(@NotNull Context context, @NotNull BCutRequestToDetail bCutRequestToDetail);

    void goToTemplateListPage(@NotNull Context context, @NotNull BcutRequest bcutRequest);

    void goToUGCTemplatePreviewPage(@NotNull Context context, @NotNull BCutRequestToDetail bCutRequestToDetail);

    boolean isCollisionAnimating(@NotNull FrameLayout frameLayout);

    @MainThread
    void loadTimeline(@NotNull Activity activity, @NotNull BcutRequest bcutRequest, int i7, @Nullable Function2<? super Integer, ? super Integer, Unit> function2, @NotNull Function3<? super String, ? super byte[], ? super Integer, Unit> function3, @NotNull Function1<? super Throwable, Unit> function1);

    void openDraft(@NotNull Context context, int i7, @NotNull String str, @Nullable Bundle bundle);

    void openVideoCrop(@NotNull Context context, @NotNull BCutVideoData bCutVideoData, @Nullable String str);

    void parseIntent2BCutVideoData(@Nullable Intent intent, @NotNull BCutVideoData bCutVideoData);

    @NotNull
    List<BCutDraftInfo> queryAllDrafts(int i7);

    @NotNull
    List<BCutDraftInfo> queryDrafts(int i7, int i8, int i9);

    void registerBusinessAcion(@NotNull IBCutConfigAction iBCutConfigAction);

    void registerSoLoader(@NotNull IBCutSoLoader iBCutSoLoader);

    void releaseAllAITask();

    void releaseTemplate();

    void renderVideo(@NotNull Context context, @NotNull String str, @NotNull String str2, int i7, @Nullable BCutCodecInfo bCutCodecInfo, @NotNull List<BCutVideoData> list, @NotNull String str3, @NotNull String str4, @NotNull Function1<? super String, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12, @Nullable Function1<? super Integer, Unit> function13);

    @NotNull
    <T> String requestAITask(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull Class<T> cls, @NotNull Function3<? super String, ? super String, ? super T, Unit> function3, @NotNull Function2<? super Integer, ? super String, Unit> function2);

    boolean startCollisionAnim(@NotNull FrameLayout frameLayout);

    void startPreprocessMaterials(@NotNull Activity activity, @Nullable String str, @NotNull List<BCutVideoData> list, @Nullable Map<String, String> map, @NotNull Function1<? super List<BCutVideoData>, Unit> function1, @NotNull Function1<? super BCutVideoException, Unit> function12, @Nullable Function2<? super Integer, ? super Integer, Unit> function2);

    void startPreprocessTemplateAndToMaterialPage(@NotNull Activity activity, @NotNull BcutRequest bcutRequest, @NotNull Function1<? super String, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12, @Nullable Function2<? super Integer, ? super Integer, Unit> function2);

    boolean stopCollisionAnim(@NotNull FrameLayout frameLayout);

    void stopPreprocessMaterials();

    void transferMmkvDataToBlkv(@Nullable Context context);
}
