package com.bilibili.playset.editor;

import android.hardware.Camera;
import android.net.Uri;
import androidx.fragment.app.FragmentActivity;
import bolts.Continuation;
import bolts.Task;
import com.bilibili.boxing.Boxing;
import com.bilibili.boxing.model.config.CropConfig;
import com.bilibili.boxing.model.config.PickerConfig;
import com.bilibili.droid.ToastHelper;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.ui.PermissionsChecker;
import com.bilibili.moduleservice.main.ImagePickService;
import java.io.File;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: renamed from: com.bilibili.playset.editor.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/editor/i.class */
public final /* synthetic */ class C5942i implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PlaySetEditorFragmentV2 f84817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f84818b;

    public /* synthetic */ C5942i(PlaySetEditorFragmentV2 playSetEditorFragmentV2, int i7) {
        this.f84817a = playSetEditorFragmentV2;
        this.f84818b = i7;
    }

    @Override // bolts.Continuation
    public final Object then(Task task) {
        Unit unit;
        final FragmentActivity fragmentActivityP3;
        boolean zIsCancelled = task.isCancelled();
        final PlaySetEditorFragmentV2 playSetEditorFragmentV2 = this.f84817a;
        if (zIsCancelled || task.isFaulted()) {
            ToastHelper.showToastShort(playSetEditorFragmentV2.p3(), 2131841601);
            unit = Unit.INSTANCE;
        } else {
            int i7 = this.f84818b;
            if (i7 == 1) {
                FragmentActivity fragmentActivityP32 = playSetEditorFragmentV2.p3();
                if (fragmentActivityP32 != null) {
                    File externalCacheDir = fragmentActivityP32.getExternalCacheDir();
                    if (externalCacheDir == null) {
                        ToastHelper.showToastShort(fragmentActivityP32, 2131842524);
                    } else {
                        ImagePickService imagePickService = (ImagePickService) BLRouter.get$default(BLRouter.INSTANCE, ImagePickService.class, (String) null, 2, (Object) null);
                        if (imagePickService != null) {
                            Class<?> imagePickActivityClass = imagePickService.getImagePickActivityClass();
                            Uri.Builder builderAppendPath = androidx.core.content.c.a("file").appendPath(externalCacheDir.getAbsolutePath());
                            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                            CropConfig cropConfig = new CropConfig(builderAppendPath.appendPath(String.format(Locale.US, "%s.jpg", Arrays.copyOf(new Object[]{Long.valueOf(System.currentTimeMillis())}, 1))).build());
                            cropConfig.b = 16.0f;
                            cropConfig.c = 10.0f;
                            cropConfig.d = 512;
                            cropConfig.e = 512;
                            Boxing.of(new PickerConfig(PickerConfig.Mode.SINGLE_IMG).withCropConfig(cropConfig)).withIntent(fragmentActivityP32, imagePickActivityClass).start(playSetEditorFragmentV2, 1002);
                        }
                    }
                }
            } else if (i7 == 2 && !playSetEditorFragmentV2.lf() && (fragmentActivityP3 = playSetEditorFragmentV2.p3()) != null) {
                PermissionsChecker.grantCameraPermission(fragmentActivityP3, playSetEditorFragmentV2.getLifecycle(), playSetEditorFragmentV2.getString(2131841589)).continueWith(new Continuation(fragmentActivityP3, playSetEditorFragmentV2) { // from class: com.bilibili.playset.editor.g

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final FragmentActivity f84813a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final PlaySetEditorFragmentV2 f84814b;

                    {
                        this.f84813a = fragmentActivityP3;
                        this.f84814b = playSetEditorFragmentV2;
                    }

                    @Override // bolts.Continuation
                    public final Object then(Task task2) {
                        Unit unit2;
                        boolean zIsCancelled2 = task2.isCancelled();
                        FragmentActivity fragmentActivity = this.f84813a;
                        if (zIsCancelled2 || task2.isFaulted()) {
                            ToastHelper.showToastShort(fragmentActivity, 2131841597);
                            unit2 = Unit.INSTANCE;
                        } else {
                            try {
                                Camera cameraOpen = Camera.open();
                                if (cameraOpen != null) {
                                    cameraOpen.release();
                                }
                                this.f84814b.lf();
                                unit2 = Unit.INSTANCE;
                            } catch (Exception e7) {
                                ToastHelper.showToastShort(fragmentActivity, 2131841597);
                                unit2 = Unit.INSTANCE;
                            }
                        }
                        return unit2;
                    }
                }, Task.UI_THREAD_EXECUTOR);
            }
            unit = Unit.INSTANCE;
        }
        return unit;
    }
}
