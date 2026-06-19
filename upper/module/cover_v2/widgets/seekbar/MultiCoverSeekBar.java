package com.bilibili.upper.module.cover_v2.widgets.seekbar;

import HB.e;
import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import bG0.g;
import com.bilibili.droid.ToastHelper;
import com.bilibili.droid.thread.HandlerThreads;
import com.bilibili.lib.accountsui.quick.b;
import com.bilibili.lib.image2.view.BiliImageView;
import com.bilibili.upper.module.contribute.up.ui.ManuscriptEditV7Fragment;
import com.bilibili.upper.module.cover_v2.widgets.seekbar.MultiCoverSeekBar;
import com.bilibili.upper.widget.thumb.HScrollView;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import lJ0.C7824c;
import lJ0.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/cover_v2/widgets/seekbar/MultiCoverSeekBar.class */
@StabilityInferred(parameters = 0)
public final class MultiCoverSeekBar extends RelativeLayout {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f113040y = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public String f113041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f113042b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f113043c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final RecyclerView f113044d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final HScrollView f113045e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public b f113046f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public final com.bilibili.upper.module.cover_v2.widgets.seekbar.b f113047g;

    @Nullable
    public final MediaMetadataRetriever h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public final ImageView f113048i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public final View f113049j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public final View f113050k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f113051l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f113052m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public final View f113053n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public final View f113054o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f113055p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f113056q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f113057r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f113058s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float f113059t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f113060u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f113061v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public final e f113062w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @Nullable
    public a f113063x;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/cover_v2/widgets/seekbar/MultiCoverSeekBar$a.class */
    public interface a {
        void a(long j7, boolean z6, boolean z7);

        void b();
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/cover_v2/widgets/seekbar/MultiCoverSeekBar$b.class */
    public final class b extends RecyclerView.Adapter<c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f113064a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final List<String> f113065b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final MultiCoverSeekBar f113066c;

        public b(MultiCoverSeekBar multiCoverSeekBar, int i7) {
            this.f113066c = multiCoverSeekBar;
            this.f113064a = i7;
            for (int i8 = 0; i8 < i7; i8++) {
                ((ArrayList) this.f113065b).add("");
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            return this.f113064a;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i7) {
            c cVar = (c) viewHolder;
            cVar.f113067a.setImageResource(2131244228);
            String str = (String) ((ArrayList) this.f113065b).get(i7);
            boolean zIsEmpty = TextUtils.isEmpty(str);
            BiliImageView biliImageView = cVar.f113067a;
            if (zIsEmpty) {
                biliImageView.setImageResource(2131244228);
            } else {
                biliImageView.setImageURI(Uri.fromFile(new File(str)));
            }
            MultiCoverSeekBar multiCoverSeekBar = this.f113066c;
            if (multiCoverSeekBar.f113044d != null && multiCoverSeekBar.f113061v && i7 == this.f113064a - 1) {
                int mPercent = (int) (multiCoverSeekBar.getMPercent() * multiCoverSeekBar.f113044d.getHeight());
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) biliImageView.getLayoutParams();
                layoutParams.width = mPercent;
                layoutParams.height = multiCoverSeekBar.f113044d.getHeight();
                biliImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                biliImageView.setLayoutParams(layoutParams);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i7) {
            return new c(LayoutInflater.from(viewGroup.getContext()).inflate(2131501860, (ViewGroup) null));
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/cover_v2/widgets/seekbar/MultiCoverSeekBar$c.class */
    @StabilityInferred(parameters = 0)
    public static final class c extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final BiliImageView f113067a;

        public c(@NotNull View view) {
            super(view);
            this.f113067a = view.findViewById(2131304535);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/cover_v2/widgets/seekbar/MultiCoverSeekBar$d.class */
    public final class d extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MultiCoverSeekBar f113068a;

        public d(MultiCoverSeekBar multiCoverSeekBar) {
            this.f113068a = multiCoverSeekBar;
        }

        @Override // android.os.Handler
        public final void handleMessage(@NotNull Message message) {
            super.handleMessage(message);
            int i7 = message.what;
            int i8 = MultiCoverSeekBar.f113040y;
            if (i7 != 1) {
                if (i7 == 2) {
                    return;
                }
                return;
            }
            MultiCoverSeekBar multiCoverSeekBar = this.f113068a;
            b bVar = multiCoverSeekBar.f113046f;
            if (bVar != null) {
                String str = (String) message.obj;
                if (message.arg1 <= ((ArrayList) bVar.f113065b).size() - 1) {
                    if (Intrinsics.areEqual("", ((ArrayList) multiCoverSeekBar.f113046f.f113065b).get(message.arg1))) {
                        ((ArrayList) multiCoverSeekBar.f113046f.f113065b).set(message.arg1, str);
                        b bVar2 = multiCoverSeekBar.f113046f;
                        int i9 = message.arg1;
                        bVar2.notifyItemChanged(i9, Integer.valueOf(i9));
                    }
                }
            }
            MultiCoverSeekBar.b(multiCoverSeekBar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public MultiCoverSeekBar(@org.jetbrains.annotations.Nullable android.content.Context r8, @org.jetbrains.annotations.Nullable android.util.AttributeSet r9) {
        /*
            Method dump skipped, instruction units count: 272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.upper.module.cover_v2.widgets.seekbar.MultiCoverSeekBar.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public static final void b(MultiCoverSeekBar multiCoverSeekBar) {
        File fileB;
        Bitmap bitmapA;
        if (multiCoverSeekBar.getContext() == null || (fileB = com.bilibili.upper.module.cover_v2.widgets.seekbar.b.b(multiCoverSeekBar.getContext(), multiCoverSeekBar.f113041a, multiCoverSeekBar.f113060u * multiCoverSeekBar.f113058s)) == null || (bitmapA = C7824c.a(200, 200, fileB.getAbsolutePath())) == null) {
            return;
        }
        multiCoverSeekBar.f113048i.setImageBitmap(bitmapA);
    }

    public static final int getHANDLER_UI_REFRESH() {
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setVideoSeek$lambda$0(MultiCoverSeekBar multiCoverSeekBar) {
        multiCoverSeekBar.f113047g.a(multiCoverSeekBar.f113041a);
    }

    public final void c() {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f113053n.getLayoutParams();
        layoutParams.width = getMeasuredWidth() / 2;
        layoutParams.height = -1;
        this.f113053n.setLayoutParams(layoutParams);
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f113054o.getLayoutParams();
        layoutParams2.width = getMeasuredWidth() / 2;
        layoutParams2.height = -1;
        this.f113054o.setLayoutParams(layoutParams2);
        this.f113054o.setLayoutParams(layoutParams2);
    }

    public final long getCurrentSeekTime() {
        return this.f113052m;
    }

    public final int getMCurrentRecyclerX() {
        return this.f113057r;
    }

    public final float getMPercent() {
        return this.f113059t;
    }

    @Nullable
    public final a getOnSeekBarChangeListener() {
        return this.f113063x;
    }

    public final int getPerS() {
        return this.f113058s;
    }

    public final boolean getSys_error() {
        return this.f113055p;
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public final void onMeasure(int i7, int i8) {
        super.onMeasure(i7, i8);
        if (getMeasuredWidth() == 0 || this.f113056q) {
            return;
        }
        this.f113056q = true;
        c();
    }

    public final void setCoverEnable(boolean z6) {
        View view = this.f113050k;
        if (view != null) {
            view.setVisibility(z6 ? 0 : 8);
        }
        if (z6) {
            View view2 = this.f113049j;
            if (view2 != null) {
                view2.setVisibility(8);
            }
            ImageView imageView = this.f113048i;
            if (imageView != null) {
                g.c(imageView, true);
            }
            View view3 = this.f113049j;
            if (view3 != null) {
                view3.setOnClickListener(null);
                return;
            }
            return;
        }
        View view4 = this.f113049j;
        if (view4 != null) {
            g.c(view4, true);
        }
        ImageView imageView2 = this.f113048i;
        if (imageView2 != null) {
            imageView2.setVisibility(8);
        }
        View view5 = this.f113049j;
        if (view5 != null) {
            view5.setOnClickListener(this.f113062w);
        }
    }

    public final void setMCurrentRecyclerX(int i7) {
        this.f113057r = i7;
    }

    public final void setMPercent(float f7) {
        this.f113059t = f7;
    }

    public final void setOnSeekBarChangeListener(@Nullable a aVar) {
        this.f113063x = aVar;
    }

    public final void setPerS(int i7) {
        this.f113058s = i7;
    }

    public final void setSys_error(boolean z6) {
        this.f113055p = z6;
    }

    public final void setVideoPath(@NotNull String str) {
        this.f113041a = str;
        if (TextUtils.isEmpty(str)) {
            BLog.e("ThumbFragment", "视频文件路径为空");
            this.f113055p = true;
        } else {
            try {
                this.h.setDataSource(this.f113041a);
            } catch (Exception e7) {
                BLog.e("ThumbFragment", "系统api异常");
                this.f113055p = true;
                lJ0.d.a(getContext(), this.f113041a);
            }
        }
        long jA = l.a(this.h);
        this.f113043c = jA;
        int i7 = ((int) jA) / 1000;
        int iD = com.bilibili.upper.module.cover_v2.widgets.seekbar.b.d(jA);
        this.f113061v = jA - ((long) (((i7 / iD) * iD) * 1000)) != 0;
        long j7 = this.f113043c;
        int i8 = ((int) j7) / 1000;
        int iD2 = com.bilibili.upper.module.cover_v2.widgets.seekbar.b.d(j7);
        int i9 = i8 / iD2;
        float f7 = j7;
        this.f113059t = (f7 - (i9 * r0)) / (iD2 * 1000);
        com.bilibili.upper.module.cover_v2.widgets.seekbar.b bVar = this.f113047g;
        String str2 = this.f113041a;
        bVar.getClass();
        if (!TextUtils.isEmpty(str2)) {
            bVar.f113074d = new MediaMetadataRetriever();
            try {
                File file = new File(str2);
                if (file.exists()) {
                    bVar.f113074d.setDataSource(bVar.f113073c, Uri.fromFile(file));
                } else {
                    bVar.f113074d.setDataSource(bVar.f113073c, Uri.parse(str2));
                }
                long jA2 = l.a(bVar.f113074d);
                bVar.f113076f = jA2;
                bVar.f113075e = com.bilibili.upper.module.cover_v2.widgets.seekbar.b.d(jA2);
                if (l.d(bVar.f113074d) == 0 || l.c(bVar.f113074d) == 0) {
                    bVar.h = true;
                } else {
                    bVar.f113077g = l.c(bVar.f113074d) / l.d(bVar.f113074d);
                }
            } catch (Exception e8) {
                ToastHelper.showToastShort(bVar.f113073c, "该视频格式异常");
                bVar.h = true;
            }
        }
        Context context = getContext();
        String str3 = this.f113041a;
        context.getSharedPreferences("Thumb", 0).getInt("seekX_" + str3, 0);
        this.f113042b = com.bilibili.upper.module.cover_v2.widgets.seekbar.b.c(this.f113043c);
        this.f113058s = com.bilibili.upper.module.cover_v2.widgets.seekbar.b.d(this.f113043c);
        b bVar2 = new b(this, this.f113042b);
        this.f113046f = bVar2;
        this.f113044d.setAdapter(bVar2);
        final int i10 = 0;
        HandlerThreads.post(2, new Runnable(this, i10) { // from class: UH0.a

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f24676a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f24677b;

            {
                this.f24676a = i10;
                this.f24677b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (this.f24676a) {
                    case 0:
                        MultiCoverSeekBar.setVideoSeek$lambda$0((MultiCoverSeekBar) this.f24677b);
                        break;
                    case 1:
                        ((b.c) this.f24677b).a();
                        break;
                    case 2:
                        ManuscriptEditV7Fragment manuscriptEditV7Fragment = (ManuscriptEditV7Fragment) this.f24677b;
                        com.bilibili.studio.editor.moudle.caption.setting.widget.a aVar = manuscriptEditV7Fragment.y;
                        if (aVar != null) {
                            aVar.c();
                        }
                        com.bilibili.studio.editor.moudle.caption.setting.widget.a aVar2 = manuscriptEditV7Fragment.y;
                        if (aVar2 != null) {
                            aVar2.f106004b = manuscriptEditV7Fragment;
                        }
                        break;
                    default:
                        com.bilibili.lib.bcanvas.d dVar = (com.bilibili.lib.bcanvas.d) this.f24677b;
                        if (dVar.a.x.compareAndSet(true, false)) {
                            com.bilibili.lib.bcanvas.e.g(dVar.a);
                        }
                        break;
                }
            }
        });
        HScrollView hScrollView = this.f113045e;
        if (hScrollView != null) {
            hScrollView.setOnOnHScrollListener(new com.bilibili.upper.module.cover_v2.widgets.seekbar.a(this));
        }
        HScrollView hScrollView2 = this.f113045e;
        if (hScrollView2 != null) {
            hScrollView2.setOnTouchListener(new View.OnTouchListener(this) { // from class: UH0.b

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final MultiCoverSeekBar f24678a;

                {
                    this.f24678a = this;
                }

                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    this.f24678a.f113051l = true;
                    return false;
                }
            });
        }
    }
}
