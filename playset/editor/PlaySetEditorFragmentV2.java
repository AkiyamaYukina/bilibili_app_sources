package com.bilibili.playset.editor;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import bolts.Continuation;
import bolts.Task;
import com.bilibili.boxing.Boxing;
import com.bilibili.boxing.loader.BoxingCrop;
import com.bilibili.boxing.model.entity.BaseMedia;
import com.bilibili.boxing.model.entity.impl.ImageMedia;
import com.bilibili.lib.ui.callback.IBackPress;
import com.bilibili.magicasakura.widgets.TintProgressDialog;
import com.bilibili.playset.editor.PlaySetEditorFragmentV2;
import com.bilibili.playset.editor.PlaySetImageHelper;
import com.bilibili.playset.editor.Q;
import com.bilibili.pvtracker.IPvTracker;
import dagger.hilt.android.AndroidEntryPoint;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import js0.InterfaceC7721c;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/editor/PlaySetEditorFragmentV2.class */
@StabilityInferred(parameters = 0)
@AndroidEntryPoint
public final class PlaySetEditorFragmentV2 extends Hilt_PlaySetEditorFragmentV2 implements IPvTracker, IBackPress, InterfaceC5935b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final ActivityResultLauncher<Intent> f84788g = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new com.bilibili.app.preferences.l(this));

    @Nullable
    public Uri h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final Lazy f84789i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f84790j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public TintProgressDialog f84791k;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/editor/PlaySetEditorFragmentV2$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f84792a;

        static {
            int[] iArr = new int[PlaySetImageHelper.PhotoSource.values().length];
            try {
                iArr[PlaySetImageHelper.PhotoSource.TAKE.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[PlaySetImageHelper.PhotoSource.CHOOSE.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            f84792a = iArr;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/editor/PlaySetEditorFragmentV2$b.class */
    public static final class b implements Q.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PlaySetEditorFragmentV2 f84793a;

        public b(PlaySetEditorFragmentV2 playSetEditorFragmentV2) {
            this.f84793a = playSetEditorFragmentV2;
        }

        @Override // com.bilibili.playset.editor.Q.b
        public final void onFailure() {
            this.f84793a.kf().I0(InterfaceC7721c.C1305c.f122579a);
        }

        @Override // com.bilibili.playset.editor.Q.b
        public final void onSuccess(String str) {
            PlaySetEditorFragmentV2 playSetEditorFragmentV2 = this.f84793a;
            playSetEditorFragmentV2.kf().I0(InterfaceC7721c.C1305c.f122579a);
            if (str != null) {
                if (str.length() <= 0) {
                    str = null;
                }
                if (str != null) {
                    playSetEditorFragmentV2.kf().I0(new InterfaceC7721c.e(str));
                }
            }
        }
    }

    public PlaySetEditorFragmentV2() {
        final Function0<Fragment> function0 = new Function0<Fragment>(this) { // from class: com.bilibili.playset.editor.PlaySetEditorFragmentV2$special$$inlined$viewModels$default$1
            final Fragment $this_viewModels;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_viewModels = this;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final Fragment m8537invoke() {
                return this.$this_viewModels;
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>(function0) { // from class: com.bilibili.playset.editor.PlaySetEditorFragmentV2$special$$inlined$viewModels$default$2
            final Function0 $ownerProducer;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$ownerProducer = function0;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final ViewModelStoreOwner m8538invoke() {
                return (ViewModelStoreOwner) this.$ownerProducer.invoke();
            }
        });
        final Function0 function02 = null;
        this.f84789i = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(PlaySetEditorViewModel.class), new Function0<ViewModelStore>(lazy) { // from class: com.bilibili.playset.editor.PlaySetEditorFragmentV2$special$$inlined$viewModels$default$3
            final Lazy $owner$delegate;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$owner$delegate = lazy;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final ViewModelStore m8539invoke() {
                return FragmentViewModelLazyKt.m4419viewModels$lambda1(this.$owner$delegate).getViewModelStore();
            }
        }, new Function0<CreationExtras>(function02, lazy) { // from class: com.bilibili.playset.editor.PlaySetEditorFragmentV2$special$$inlined$viewModels$default$4
            final Function0 $extrasProducer;
            final Lazy $owner$delegate;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$extrasProducer = function02;
                this.$owner$delegate = lazy;
            }

            /* JADX WARN: Removed duplicated region for block: B:6:0x0019  */
            @org.jetbrains.annotations.NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final androidx.lifecycle.viewmodel.CreationExtras m8540invoke() {
                /*
                    r2 = this;
                    r0 = r2
                    kotlin.jvm.functions.Function0 r0 = r0.$extrasProducer
                    r3 = r0
                    r0 = r3
                    if (r0 == 0) goto L19
                    r0 = r3
                    java.lang.Object r0 = r0.invoke()
                    androidx.lifecycle.viewmodel.CreationExtras r0 = (androidx.lifecycle.viewmodel.CreationExtras) r0
                    r4 = r0
                    r0 = r4
                    r3 = r0
                    r0 = r4
                    if (r0 != 0) goto L44
                L19:
                    r0 = r2
                    kotlin.Lazy r0 = r0.$owner$delegate
                    androidx.lifecycle.ViewModelStoreOwner r0 = androidx.fragment.app.FragmentViewModelLazyKt.m4417access$viewModels$lambda1(r0)
                    r3 = r0
                    r0 = r3
                    boolean r0 = r0 instanceof androidx.lifecycle.HasDefaultViewModelProviderFactory
                    if (r0 == 0) goto L30
                    r0 = r3
                    androidx.lifecycle.HasDefaultViewModelProviderFactory r0 = (androidx.lifecycle.HasDefaultViewModelProviderFactory) r0
                    r3 = r0
                    goto L32
                L30:
                    r0 = 0
                    r3 = r0
                L32:
                    r0 = r3
                    if (r0 == 0) goto L40
                    r0 = r3
                    androidx.lifecycle.viewmodel.CreationExtras r0 = r0.getDefaultViewModelCreationExtras()
                    r3 = r0
                    goto L44
                L40:
                    androidx.lifecycle.viewmodel.CreationExtras$Empty r0 = androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE
                    r3 = r0
                L44:
                    r0 = r3
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playset.editor.PlaySetEditorFragmentV2$special$$inlined$viewModels$default$4.m8540invoke():androidx.lifecycle.viewmodel.CreationExtras");
            }
        }, new Function0<ViewModelProvider.Factory>(this, lazy) { // from class: com.bilibili.playset.editor.PlaySetEditorFragmentV2$special$$inlined$viewModels$default$5
            final Lazy $owner$delegate;
            final Fragment $this_viewModels;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_viewModels = this;
                this.$owner$delegate = lazy;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
            @org.jetbrains.annotations.NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final androidx.lifecycle.ViewModelProvider.Factory m8541invoke() {
                /*
                    r2 = this;
                    r0 = r2
                    kotlin.Lazy r0 = r0.$owner$delegate
                    androidx.lifecycle.ViewModelStoreOwner r0 = androidx.fragment.app.FragmentViewModelLazyKt.m4417access$viewModels$lambda1(r0)
                    r3 = r0
                    r0 = r3
                    boolean r0 = r0 instanceof androidx.lifecycle.HasDefaultViewModelProviderFactory
                    if (r0 == 0) goto L17
                    r0 = r3
                    androidx.lifecycle.HasDefaultViewModelProviderFactory r0 = (androidx.lifecycle.HasDefaultViewModelProviderFactory) r0
                    r3 = r0
                    goto L19
                L17:
                    r0 = 0
                    r3 = r0
                L19:
                    r0 = r3
                    if (r0 == 0) goto L2a
                    r0 = r3
                    androidx.lifecycle.ViewModelProvider$Factory r0 = r0.getDefaultViewModelProviderFactory()
                    r4 = r0
                    r0 = r4
                    r3 = r0
                    r0 = r4
                    if (r0 != 0) goto L32
                L2a:
                    r0 = r2
                    androidx.fragment.app.Fragment r0 = r0.$this_viewModels
                    androidx.lifecycle.ViewModelProvider$Factory r0 = r0.getDefaultViewModelProviderFactory()
                    r3 = r0
                L32:
                    r0 = r3
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playset.editor.PlaySetEditorFragmentV2$special$$inlined$viewModels$default$5.m8541invoke():androidx.lifecycle.ViewModelProvider$Factory");
            }
        });
        this.f84790j = 1;
    }

    @Override // com.bilibili.playset.editor.InterfaceC5935b
    public final void P6(@Nullable Bitmap bitmap) {
        if (bitmap == null || p3() == null) {
            return;
        }
        kf().I0(new InterfaceC7721c.j(getString(2131842491)));
        Q.a(bitmap, new b(this));
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    @NotNull
    public final String getPvEventId() {
        return this.f84790j == 1 ? "playlist.new-playlist.0.0.pv" : "playlist.edit-playlist.0.0.pv";
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    @NotNull
    public final Bundle getPvExtra() {
        return new Bundle();
    }

    public final PlaySetEditorViewModel kf() {
        return (PlaySetEditorViewModel) this.f84789i.getValue();
    }

    public final boolean lf() {
        Context context = getContext();
        if (context == null) {
            return false;
        }
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        ContentResolver contentResolver = context.getContentResolver();
        String strA = com.bilibili.app.authorspace.local.service.j.a(System.currentTimeMillis(), ".jpg");
        ContentValues contentValues = new ContentValues();
        contentValues.put("_display_name", strA);
        contentValues.put("title", strA);
        contentValues.put("mime_type", "image/jpeg");
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 29) {
            contentValues.put("relative_path", "Pictures/bili");
        }
        Uri uriInsert = i7 >= 29 ? contentResolver.insert(MediaStore.Images.Media.getContentUri("external"), contentValues) : contentResolver.insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
        this.h = uriInsert;
        intent.putExtra("output", uriInsert);
        try {
            this.f84788g.launch(intent);
            return true;
        } catch (Exception e7) {
            return false;
        }
    }

    public final void mf(final PlaySetImageHelper.PhotoSource photoSource, final Uri uri) {
        if (PlaySetImageHelper.b(uri, p3()) || getContext() == null) {
            return;
        }
        Task.callInBackground(new Callable(this, photoSource, uri) { // from class: com.bilibili.playset.editor.j

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final PlaySetEditorFragmentV2 f84819a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final PlaySetImageHelper.PhotoSource f84820b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final Uri f84821c;

            {
                this.f84819a = this;
                this.f84820b = photoSource;
                this.f84821c = uri;
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
            @Override // java.util.concurrent.Callable
            public final Object call() throws Throwable {
                Bitmap bitmapE;
                Uri uri2 = this.f84821c;
                PlaySetEditorFragmentV2 playSetEditorFragmentV2 = this.f84819a;
                playSetEditorFragmentV2.getClass();
                int i7 = PlaySetEditorFragmentV2.a.f84792a[this.f84820b.ordinal()];
                if (i7 == 1) {
                    bitmapE = PlaySetImageHelper.e(playSetEditorFragmentV2.getContext(), uri2);
                } else {
                    if (i7 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bitmapE = PlaySetImageHelper.d(playSetEditorFragmentV2.getContext(), uri2);
                }
                return bitmapE;
            }
        }).continueWith(new Continuation(this) { // from class: com.bilibili.playset.editor.k

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final PlaySetEditorFragmentV2 f84822a;

            {
                this.f84822a = this;
            }

            @Override // bolts.Continuation
            public final Object then(Task task) {
                if (task.isCompleted()) {
                    this.f84822a.P6((Bitmap) task.getResult());
                }
                return Unit.INSTANCE;
            }
        }, Task.UI_THREAD_EXECUTOR);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i7, int i8, @Nullable Intent intent) {
        ArrayList result;
        super.onActivityResult(i7, i8, intent);
        if (i8 == -1) {
            if (i7 == 1003 && intent != null) {
                mf(PlaySetImageHelper.PhotoSource.CHOOSE, BoxingCrop.getInstance().onCropFinish(1003, intent));
            }
            if (i7 != 1002 || intent == null || (result = Boxing.getResult(intent)) == null || result.isEmpty()) {
                return;
            }
            ImageMedia imageMedia = (BaseMedia) CollectionsKt.getOrNull(result, 0);
            ImageMedia imageMedia2 = imageMedia instanceof ImageMedia ? imageMedia : null;
            if (imageMedia2 != null) {
                mf(PlaySetImageHelper.PhotoSource.CHOOSE, imageMedia2.getImageUri());
            }
        }
    }

    @Override // com.bilibili.lib.ui.callback.IBackPress
    public final boolean onBackPressed() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0128  */
    @Override // androidx.fragment.app.Fragment
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View onCreateView(@org.jetbrains.annotations.NotNull android.view.LayoutInflater r13, @org.jetbrains.annotations.Nullable android.view.ViewGroup r14, @org.jetbrains.annotations.Nullable android.os.Bundle r15) {
        /*
            Method dump skipped, instruction units count: 362
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playset.editor.PlaySetEditorFragmentV2.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        TintProgressDialog tintProgressDialog = this.f84791k;
        if (tintProgressDialog != null) {
            if (tintProgressDialog != null) {
                tintProgressDialog.dismiss();
            }
            this.f84791k = null;
        }
    }
}
