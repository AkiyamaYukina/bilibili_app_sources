package com.bilibili.upper.widget.thumb;

import C60.f;
import N1.p;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.media3.common.PlaybackException;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SimpleItemAnimator;
import com.bilibili.droid.ToastHelper;
import com.bilibili.droid.thread.HandlerThreads;
import com.bilibili.lib.image2.view.BiliImageView;
import com.bilibili.lib.ui.BaseFragment;
import com.bilibili.lib.ui.mixin.Flag;
import com.bilibili.mediautils.FileUtils;
import com.bilibili.studio.material.util.UtilsKt;
import com.bilibili.upper.module.editthumb.EditThumbActivity;
import com.bilibili.upper.widget.thumb.ThumbFragment;
import eJ0.C6931i;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import lJ0.C7824c;
import lJ0.i;
import lJ0.k;
import lJ0.l;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/widget/thumb/ThumbFragment.class */
public class ThumbFragment extends BaseFragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f114617b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f114618c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f114619d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public BiliImageView f114620e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public FrameLayout f114621f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public RecyclerView f114622g;
    public HScrollView h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public b f114623i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public com.bilibili.upper.widget.thumb.b f114624j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public MediaMetadataRetriever f114625k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public k f114626l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ImageView f114627m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public View f114628n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public View f114629o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public AsyncTask<Integer, Integer, String> f114630p;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f114634t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public float f114635u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f114636v;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f114631q = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final a f114632r = new a(this);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f114633s = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f114637w = false;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/widget/thumb/ThumbFragment$a.class */
    public final class a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ThumbFragment f114638a;

        public a(ThumbFragment thumbFragment) {
            this.f114638a = thumbFragment;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            final ThumbFragment thumbFragment = this.f114638a;
            int iD = l.d(thumbFragment.f114625k);
            int iC = l.c(thumbFragment.f114625k);
            if (iD == 0 || iC == 0) {
                thumbFragment.f114631q = true;
                lJ0.d.a(thumbFragment.p3(), thumbFragment.f114617b);
                thumbFragment.kf();
            } else {
                int iC2 = C6931i.c(thumbFragment.getContext());
                int height = thumbFragment.f114621f.getHeight();
                int iB = height;
                if (height == 0) {
                    iB = (int) (C6931i.b(thumbFragment.getContext()) * 0.66944444f);
                }
                if (iD / iC > iC2 / iB) {
                    iB = (iC * iC2) / iD;
                } else {
                    iC2 = (iD * iB) / iC;
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) thumbFragment.f114620e.getLayoutParams();
                layoutParams.width = iC2;
                layoutParams.height = iB;
                thumbFragment.f114620e.setLayoutParams(layoutParams);
                long jA = l.a(thumbFragment.f114625k);
                thumbFragment.f114619d = jA;
                int i7 = ((int) jA) / 1000;
                int iE = com.bilibili.upper.widget.thumb.b.e(jA);
                thumbFragment.f114637w = jA - ((long) (((i7 / iE) * iE) * 1000)) != 0;
                long j7 = thumbFragment.f114619d;
                int i8 = ((int) j7) / 1000;
                int iE2 = com.bilibili.upper.widget.thumb.b.e(j7);
                int i9 = i8 / iE2;
                float f7 = j7;
                thumbFragment.f114635u = (f7 - (i9 * r0)) / (iE2 * 1000);
                com.bilibili.upper.widget.thumb.b bVar = thumbFragment.f114624j;
                String str = thumbFragment.f114617b;
                bVar.getClass();
                if (!TextUtils.isEmpty(str)) {
                    MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                    bVar.f114651d = mediaMetadataRetriever;
                    try {
                        mediaMetadataRetriever.setDataSource(bVar.f114650c, Uri.parse(str));
                        long jA2 = l.a(bVar.f114651d);
                        bVar.f114653f = jA2;
                        bVar.f114652e = com.bilibili.upper.widget.thumb.b.e(jA2);
                        if (l.d(bVar.f114651d) == 0 || l.c(bVar.f114651d) == 0) {
                            bVar.h = true;
                        } else {
                            bVar.f114654g = l.c(bVar.f114651d) / l.d(bVar.f114651d);
                        }
                    } catch (Exception e7) {
                        ToastHelper.showToastShort(bVar.f114650c, "该视频格式异常");
                        bVar.h = true;
                    }
                }
                Context context = thumbFragment.getContext();
                String str2 = thumbFragment.f114617b;
                final int i10 = context.getSharedPreferences("Thumb", 0).getInt("seekX_" + str2, 0);
                thumbFragment.f114618c = com.bilibili.upper.widget.thumb.b.d(thumbFragment.f114619d);
                thumbFragment.f114634t = com.bilibili.upper.widget.thumb.b.e(thumbFragment.f114619d);
                b bVar2 = new b(thumbFragment, thumbFragment.f114618c);
                thumbFragment.f114623i = bVar2;
                thumbFragment.f114622g.setAdapter(bVar2);
                thumbFragment.h.post(new Runnable(thumbFragment, i10) { // from class: lJ0.f

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final ThumbFragment f123076a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final int f123077b;

                    {
                        this.f123076a = thumbFragment;
                        this.f123077b = i10;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        ThumbFragment thumbFragment2 = this.f123076a;
                        thumbFragment2.h.scrollTo(this.f123077b, 0);
                    }
                });
                HandlerThreads.post(2, new Du.d(thumbFragment, 1));
                thumbFragment.h.setOnOnHScrollListener(new com.bilibili.upper.widget.thumb.a(thumbFragment));
            }
            this.f114638a.f114621f.getViewTreeObserver().removeOnGlobalLayoutListener(this.f114638a.f114632r);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/widget/thumb/ThumbFragment$b.class */
    public final class b extends RecyclerView.Adapter<c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f114639a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<String> f114640b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ThumbFragment f114641c;

        public b(ThumbFragment thumbFragment, int i7) {
            this.f114641c = thumbFragment;
            this.f114639a = i7;
            for (int i8 = 0; i8 < i7; i8++) {
                ((ArrayList) this.f114640b).add("");
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            return this.f114639a;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i7) {
            c cVar = (c) viewHolder;
            cVar.f114642a.setImageResource(2131244228);
            String str = (String) ((ArrayList) this.f114640b).get(i7);
            boolean zIsEmpty = TextUtils.isEmpty(str);
            BiliImageView biliImageView = cVar.f114642a;
            if (zIsEmpty) {
                biliImageView.setImageResource(2131244228);
            } else {
                biliImageView.setImageURI(Uri.parse(FileUtils.SCHEME_FILE + str));
            }
            ThumbFragment thumbFragment = this.f114641c;
            if (thumbFragment.f114637w && i7 == this.f114639a - 1) {
                int height = (int) (thumbFragment.f114635u * thumbFragment.f114622g.getHeight());
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) biliImageView.getLayoutParams();
                layoutParams.width = height;
                layoutParams.height = thumbFragment.f114622g.getHeight();
                biliImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                biliImageView.setLayoutParams(layoutParams);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NonNull
        public final RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i7) {
            return new c(LayoutInflater.from(this.f114641c.getContext()).inflate(2131494792, (ViewGroup) null));
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/widget/thumb/ThumbFragment$c.class */
    public static final class c extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BiliImageView f114642a;

        public c(View view) {
            super(view);
            this.f114642a = view.findViewById(2131304535);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/widget/thumb/ThumbFragment$d.class */
    public final class d extends AsyncTask<Integer, Integer, String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f f114643a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ThumbFragment f114644b;

        public d(ThumbFragment thumbFragment, f fVar) {
            this.f114644b = thumbFragment;
            this.f114643a = fVar;
        }

        @Override // android.os.AsyncTask
        public final String doInBackground(Integer[] numArr) throws Throwable {
            Bitmap frameAtTime;
            Context context;
            MediaMetadataRetriever mediaMetadataRetriever = this.f114644b.f114625k;
            String absolutePath = null;
            if (mediaMetadataRetriever != null && (frameAtTime = mediaMetadataRetriever.getFrameAtTime(r0.f114636v * r0.f114634t * PlaybackException.CUSTOM_ERROR_CODE_BASE)) != null && (context = this.f114644b.getContext()) != null) {
                File file = new File(this.f114644b.f114617b);
                String strSubstring = file.getName().substring(0, file.getName().indexOf(UtilsKt.DOT));
                File file2 = new File(context.getExternalCacheDir(), strSubstring);
                if (!file2.isDirectory()) {
                    file2.delete();
                }
                if (!file2.exists()) {
                    file2.mkdirs();
                }
                StringBuilder sbB = p.b("thumb_", strSubstring);
                sbB.append(System.currentTimeMillis());
                sbB.append(".png");
                File file3 = new File(file2, sbB.toString());
                C7824c.b(frameAtTime, file3.getAbsolutePath());
                frameAtTime.recycle();
                absolutePath = file3.getAbsolutePath();
            }
            return absolutePath;
        }

        @Override // android.os.AsyncTask
        public final void onPostExecute(String str) {
            String str2 = str;
            if (this.f114644b.p3() == null || this.f114644b.p3().isFinishing()) {
                return;
            }
            k kVar = this.f114644b.f114626l;
            if (kVar != null) {
                kVar.dismiss();
            }
            if (str2 == null) {
                ToastHelper.showToastShort(this.f114644b.getContext(), 2131851106);
                return;
            }
            Context context = this.f114644b.getContext();
            String str3 = this.f114644b.f114617b;
            boolean z6 = false;
            if (context != null) {
                z6 = context.getSharedPreferences("Thumb", 0).getBoolean("error_" + str3, false);
            }
            if (!z6) {
                Context context2 = this.f114644b.getContext();
                ThumbFragment thumbFragment = this.f114644b;
                lJ0.d.b(thumbFragment.f114633s, thumbFragment.f114617b, context2);
            }
            f fVar = this.f114643a;
            if (fVar != null) {
                int i7 = EditThumbActivity.f113127R;
                ((EditThumbActivity) fVar.a).R6(str2);
            }
        }

        @Override // android.os.AsyncTask
        public final void onPreExecute() {
            k kVar = this.f114644b.f114626l;
            if (kVar != null) {
                kVar.show();
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/widget/thumb/ThumbFragment$e.class */
    public final class e extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ThumbFragment f114645a;

        public e(ThumbFragment thumbFragment) {
            this.f114645a = thumbFragment;
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x00ae  */
        @Override // android.os.Handler
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void handleMessage(android.os.Message r5) {
            /*
                Method dump skipped, instruction units count: 226
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.upper.widget.thumb.ThumbFragment.e.handleMessage(android.os.Message):void");
        }
    }

    public static void jf(ThumbFragment thumbFragment) {
        File fileB;
        Bitmap bitmapA;
        if (thumbFragment.getContext() == null || (fileB = com.bilibili.upper.widget.thumb.b.b(thumbFragment.getContext(), thumbFragment.f114617b, thumbFragment.f114636v * thumbFragment.f114634t)) == null || (bitmapA = C7824c.a(200, 200, fileB.getAbsolutePath())) == null) {
            return;
        }
        thumbFragment.f114627m.setImageBitmap(bitmapA);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [android.content.DialogInterface$OnClickListener, java.lang.Object] */
    public final void kf() {
        new AlertDialog.Builder(getContext()).setTitle("该视频暂不支持视频截取封面").setMessage("可从右下角'相册选择'选择封面").setCancelable(false).setPositiveButton("知道了", (DialogInterface.OnClickListener) new Object()).create().show();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004d  */
    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(@androidx.annotation.Nullable android.os.Bundle r6) {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.upper.widget.thumb.ThumbFragment.onCreate(android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        View viewInflate = layoutInflater.inflate(2131494187, viewGroup, false);
        this.f114622g = (RecyclerView) viewInflate.findViewById(2131306580);
        this.h = (HScrollView) viewInflate.findViewById(2131307182);
        this.f114621f = (FrameLayout) viewInflate.findViewById(2131302012);
        this.f114628n = viewInflate.findViewById(2131316052);
        this.f114629o = viewInflate.findViewById(2131316076);
        this.f114620e = viewInflate.findViewById(2131313251);
        this.f114627m = (ImageView) viewInflate.findViewById(2131311416);
        this.f114622g.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        this.f114622g.setNestedScrollingEnabled(false);
        ((SimpleItemAnimator) this.f114622g.getItemAnimator()).setSupportsChangeAnimations(false);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f114628n.getLayoutParams();
        layoutParams.width = C6931i.c(getContext()) / 2;
        layoutParams.height = -1;
        this.f114628n.setLayoutParams(layoutParams);
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f114629o.getLayoutParams();
        layoutParams2.width = C6931i.c(getContext()) / 2;
        layoutParams2.height = -1;
        this.f114629o.setLayoutParams(layoutParams2);
        this.f114629o.setLayoutParams(layoutParams2);
        return viewInflate;
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.h.setOnOnHScrollListener(null);
        com.bilibili.upper.widget.thumb.b bVar = this.f114624j;
        bVar.getClass();
        new i(bVar).start();
        AsyncTask<Integer, Integer, String> asyncTask = this.f114630p;
        if (asyncTask == null || asyncTask.getStatus() == AsyncTask.Status.FINISHED) {
            return;
        }
        this.f114630p.cancel(true);
    }

    @Override // com.bilibili.lib.ui.BaseFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, com.bilibili.lib.ui.mixin.IFragmentShowHide
    public final void onFragmentShow(@NonNull Flag flag) {
        super.onFragmentShow(flag);
        TE0.b.f24088a.getClass();
        TE0.b.s("视频截取");
    }

    @Override // com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (this.f114631q) {
            kf();
        } else {
            this.f114621f.getViewTreeObserver().addOnGlobalLayoutListener(this.f114632r);
        }
    }
}
