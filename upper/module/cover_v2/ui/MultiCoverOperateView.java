package com.bilibili.upper.module.cover_v2.ui;

import Ax.s;
import KH0.i;
import Xz0.g;
import Xz0.j;
import Xz0.k;
import android.content.Context;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.base.SharedPreferencesHelper;
import com.bilibili.bplus.followingpublish.fragments.StoryPublishFragment2;
import com.bilibili.bplus.followingpublish.fragments.y0;
import com.bilibili.bplus.followingpublish.model.PublishPicMode;
import com.bilibili.studio.kaleidoscope.adapter.KaleidoscopeFactory;
import com.bilibili.studio.videoeditor.util.V;
import com.bilibili.upper.module.contribute.up.web.trans.UperTransparentWebActivity;
import com.bilibili.upper.module.cover.entity.CoverEngineType;
import com.bilibili.upper.module.cover_v2.model.MultiCoverConfig;
import com.bilibili.upper.module.cover_v2.ui.MultiCoverOperateView;
import com.bilibili.upper.module.cover_v2.widgets.seekbar.MultiCoverSeekBar;
import com.bilibili.upper.widget.thumb.HScrollView;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tw0.f;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/cover_v2/ui/MultiCoverOperateView.class */
@StabilityInferred(parameters = 0)
public final class MultiCoverOperateView extends FrameLayout {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f112909f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public a f112910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public com.bilibili.upper.module.cover_v2.ui.a f112911b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public KH0.i f112912c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final View f112913d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final b f112914e;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/cover_v2/ui/MultiCoverOperateView$a.class */
    public interface a {
        void a(@Nullable String str);

        void b();

        void c(@Nullable String str);
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/cover_v2/ui/MultiCoverOperateView$b.class */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final View f112915a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final MultiCoverSeekBar f112916b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final View f112917c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final View f112918d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public final ImageView f112919e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public final View f112920f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        public final View f112921g;

        @NotNull
        public final View h;

        public b(@NotNull View view) {
            this.f112915a = view.findViewById(2131318204);
            this.f112916b = (MultiCoverSeekBar) view.findViewById(2131318182);
            this.f112917c = view.findViewById(2131318175);
            this.f112918d = view.findViewById(2131318181);
            this.f112919e = (ImageView) view.findViewById(2131318177);
            this.f112920f = view.findViewById(2131318229);
            this.f112921g = view.findViewById(2131318187);
            this.h = view.findViewById(2131318228);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/cover_v2/ui/MultiCoverOperateView$c.class */
    public static final class c implements MultiCoverSeekBar.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final KH0.i f112922a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final MultiCoverOperateView f112923b;

        public c(KH0.i iVar, MultiCoverOperateView multiCoverOperateView) {
            this.f112922a = iVar;
            this.f112923b = multiCoverOperateView;
        }

        @Override // com.bilibili.upper.module.cover_v2.widgets.seekbar.MultiCoverSeekBar.a
        public final void a(long j7, boolean z6, boolean z7) {
            if (z6) {
                KH0.i iVar = this.f112922a;
                iVar.k(j7);
                if (z7 || iVar.f12745c.getMainStrategy().c() == null) {
                    return;
                }
                SharedPreferencesHelper sharedPreferencesHelper = JH0.a.f11357a;
                MultiCoverOperateView multiCoverOperateView = this.f112923b;
                com.bilibili.upper.module.cover_v2.ui.a multCoverContextProvider = multiCoverOperateView.getMultCoverContextProvider();
                KH0.i iVarA5 = null;
                KH0.i iVarA52 = multCoverContextProvider != null ? multCoverContextProvider.A5(CoverEngineType.MAIN) : null;
                com.bilibili.upper.module.cover_v2.ui.a multCoverContextProvider2 = multiCoverOperateView.getMultCoverContextProvider();
                if (multCoverContextProvider2 != null) {
                    iVarA5 = multCoverContextProvider2.A5(CoverEngineType.SUB);
                }
                com.bilibili.upper.module.cover_v2.ui.a multCoverContextProvider3 = multiCoverOperateView.getMultCoverContextProvider();
                JH0.a.i(iVarA52, iVarA5, multCoverContextProvider3 != null ? multCoverContextProvider3.R1() : true);
            }
        }

        @Override // com.bilibili.upper.module.cover_v2.widgets.seekbar.MultiCoverSeekBar.a
        public final void b() {
            MultiCoverOperateView multiCoverOperateView = this.f112923b;
            multiCoverOperateView.setSelectImage(false);
            multiCoverOperateView.d(false);
        }
    }

    public MultiCoverOperateView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        View viewInflate = LayoutInflater.from(context).inflate(2131501576, this);
        this.f112913d = viewInflate;
        b bVar = new b(viewInflate);
        this.f112914e = bVar;
        setClipChildren(false);
        bVar.f112917c.setOnClickListener(new Kf1.j(this, 4));
        bVar.f112919e.setOnClickListener(new y0(this, 2));
        bVar.f112921g.setOnClickListener(new JS0.m(this, 2));
        final int i7 = 2;
        bVar.f112918d.setOnClickListener(new View.OnClickListener(this, i7) { // from class: BH0.c

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f736a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f737b;

            {
                this.f736a = i7;
                this.f737b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (this.f736a) {
                    case 0:
                        UperTransparentWebActivity uperTransparentWebActivity = (UperTransparentWebActivity) this.f737b;
                        int i8 = UperTransparentWebActivity.v0;
                        uperTransparentWebActivity.finish();
                        break;
                    case 1:
                        StoryPublishFragment2 storyPublishFragment2 = (StoryPublishFragment2) this.f737b;
                        int i9 = StoryPublishFragment2.q3;
                        PublishPicMode publishPicMode = PublishPicMode.BigCover;
                        if (publishPicMode != storyPublishFragment2.U2) {
                            storyPublishFragment2.ai(publishPicMode);
                        }
                        storyPublishFragment2.zg("dt.dt-produce.default.tab.click", false, new Pair[]{new Pair("tab_name", storyPublishFragment2.getString(2131843341))});
                        break;
                    case 2:
                        MultiCoverOperateView multiCoverOperateView = (MultiCoverOperateView) this.f737b;
                        int i10 = MultiCoverOperateView.f112909f;
                        if (!V.c()) {
                            multiCoverOperateView.setImageCover(null);
                            multiCoverOperateView.setSelectImage(false);
                            multiCoverOperateView.d(false);
                            MultiCoverOperateView.a aVar = multiCoverOperateView.f112910a;
                            if (aVar != null) {
                                i iVar = multiCoverOperateView.f112912c;
                                String inputVideoPath = null;
                                if (iVar != null) {
                                    MultiCoverConfig multiCoverConfig = iVar.f12745c;
                                    inputVideoPath = null;
                                    if (multiCoverConfig != null) {
                                        inputVideoPath = multiCoverConfig.getInputVideoPath();
                                    }
                                }
                                aVar.a(inputVideoPath);
                            }
                            break;
                        }
                        break;
                    default:
                        s sVar = (s) this.f737b;
                        j.c("sdk_type", KaleidoscopeFactory.SDK_MON);
                        j.c("router_topic_id", g.f28463b);
                        Map<String, String> mapB = j.b(k.f28474a);
                        ((HashMap) mapB).put("from", "1");
                        f.f127691a.d(false, "creation.new-video-editor.chapter.add.click", mapB);
                        sVar.invoke();
                        break;
                }
            }
        });
        setImageCover(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(@org.jetbrains.annotations.NotNull final KH0.i r7) {
        /*
            Method dump skipped, instruction units count: 271
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.upper.module.cover_v2.ui.MultiCoverOperateView.a(KH0.i):void");
    }

    public final void b() {
        MultiCoverSeekBar multiCoverSeekBar = this.f112914e.f112916b;
        HScrollView hScrollView = multiCoverSeekBar.f113045e;
        if (hScrollView != null) {
            hScrollView.setOnOnHScrollListener(null);
        }
        com.bilibili.upper.module.cover_v2.widgets.seekbar.b bVar = multiCoverSeekBar.f113047g;
        if (bVar != null) {
            new UH0.e(bVar).start();
        }
        try {
            MediaMetadataRetriever mediaMetadataRetriever = multiCoverSeekBar.h;
            if (mediaMetadataRetriever != null) {
                mediaMetadataRetriever.release();
            }
        } catch (Exception e7) {
            e7.printStackTrace();
        }
    }

    public final void c(boolean z6) {
        if (z6) {
            ListExtentionsKt.visible(this);
            MultiCoverSeekBar multiCoverSeekBar = this.f112914e.f112916b;
            multiCoverSeekBar.getClass();
            ListExtentionsKt.visible(multiCoverSeekBar);
            HScrollView hScrollView = multiCoverSeekBar.f113045e;
            if (hScrollView != null) {
            }
            HScrollView hScrollView2 = multiCoverSeekBar.f113045e;
            if (hScrollView2 != null) {
                hScrollView2.setEnableScrolling(true);
                return;
            }
            return;
        }
        ListExtentionsKt.gone(this);
        MultiCoverSeekBar multiCoverSeekBar2 = this.f112914e.f112916b;
        multiCoverSeekBar2.getClass();
        ListExtentionsKt.gone(multiCoverSeekBar2);
        HScrollView hScrollView3 = multiCoverSeekBar2.f113045e;
        if (hScrollView3 != null) {
        }
        HScrollView hScrollView4 = multiCoverSeekBar2.f113045e;
        if (hScrollView4 != null) {
            hScrollView4.setEnableScrolling(false);
        }
    }

    public final void d(boolean z6) {
        MultiCoverConfig multiCoverConfig;
        KH0.i iVar = this.f112912c;
        if (((iVar == null || (multiCoverConfig = iVar.f12745c) == null) ? null : multiCoverConfig.getInputImagePath()) == null) {
            a aVar = this.f112910a;
            if (aVar != null) {
                KH0.i iVar2 = this.f112912c;
                String inputVideoPath = null;
                if (iVar2 != null) {
                    MultiCoverConfig multiCoverConfig2 = iVar2.f12745c;
                    inputVideoPath = null;
                    if (multiCoverConfig2 != null) {
                        inputVideoPath = multiCoverConfig2.getInputVideoPath();
                    }
                }
                aVar.a(inputVideoPath);
                return;
            }
            return;
        }
        if (z6) {
            a aVar2 = this.f112910a;
            if (aVar2 != null) {
                KH0.i iVar3 = this.f112912c;
                String inputImagePath = null;
                if (iVar3 != null) {
                    MultiCoverConfig multiCoverConfig3 = iVar3.f12745c;
                    inputImagePath = null;
                    if (multiCoverConfig3 != null) {
                        inputImagePath = multiCoverConfig3.getInputImagePath();
                    }
                }
                aVar2.c(inputImagePath);
                return;
            }
            return;
        }
        a aVar3 = this.f112910a;
        if (aVar3 != null) {
            KH0.i iVar4 = this.f112912c;
            String inputVideoPath2 = null;
            if (iVar4 != null) {
                MultiCoverConfig multiCoverConfig4 = iVar4.f12745c;
                inputVideoPath2 = null;
                if (multiCoverConfig4 != null) {
                    inputVideoPath2 = multiCoverConfig4.getInputVideoPath();
                }
            }
            aVar3.a(inputVideoPath2);
        }
    }

    public final long getCurrentSeekTime() {
        return this.f112914e.f112916b.getCurrentSeekTime();
    }

    @Nullable
    public final com.bilibili.upper.module.cover_v2.ui.a getMultCoverContextProvider() {
        return this.f112911b;
    }

    @Nullable
    public final a getOnCoverOperateListener() {
        return this.f112910a;
    }

    public final void setImageCover(@Nullable String str) {
        MultiCoverConfig multiCoverConfig;
        KH0.i iVar = this.f112912c;
        if (iVar != null && (multiCoverConfig = iVar.f12745c) != null) {
            multiCoverConfig.setInputImagePath(str);
        }
        if (TextUtils.isEmpty(str)) {
            bG0.g.c(this.f112914e.f112917c, true);
            this.f112914e.f112919e.setVisibility(8);
            this.f112914e.f112918d.setVisibility(8);
            this.f112914e.f112920f.setVisibility(8);
            return;
        }
        this.f112914e.f112917c.setVisibility(8);
        bG0.g.c(this.f112914e.f112919e, true);
        bG0.g.c(this.f112914e.f112918d, true);
        this.f112914e.f112919e.setImageURI(Uri.fromFile(new File(str)));
    }

    public final void setMultCoverContextProvider(@Nullable com.bilibili.upper.module.cover_v2.ui.a aVar) {
        this.f112911b = aVar;
    }

    public final void setOnCoverOperateListener(@Nullable a aVar) {
        this.f112910a = aVar;
    }

    public final void setSelectImage(boolean z6) {
        MultiCoverConfig multiCoverConfig;
        bG0.g.c(this.f112914e.f112920f, z6);
        KH0.i iVar = this.f112912c;
        if (((iVar == null || (multiCoverConfig = iVar.f12745c) == null) ? null : multiCoverConfig.getInputImagePath()) != null) {
            this.f112914e.f112916b.setCoverEnable(!z6);
        } else {
            this.f112914e.f112916b.setCoverEnable(true);
        }
    }
}
