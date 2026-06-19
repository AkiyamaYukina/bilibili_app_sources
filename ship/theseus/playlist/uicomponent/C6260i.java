package com.bilibili.ship.theseus.playlist.uicomponent;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.bilibili.base.util.NumberFormat;
import com.bilibili.framework.exposure.core.collecter.ViewExposureLayoutInfoCollectorKt;
import com.bilibili.iconfont.IconFont;
import com.bilibili.iconfont.IconTextDrawable;
import com.bilibili.lib.image2.BiliImageLoader;
import com.bilibili.lib.theme.R$color;
import com.bilibili.magicasakura.widgets.TintTextView;
import com.bilibili.playerbizcommon.utils.j;
import com.bilibili.ship.theseus.playlist.PlaylistRepository;
import com.bilibili.ship.theseus.playlist.api.MultiTypeMedia;
import com.bilibili.ship.theseus.playlist.api.PugvInfo;
import com.bilibili.ship.theseus.playlist.api.SocializeInfo;
import com.bilibili.ship.theseus.playlist.api.Upper;
import com.bilibili.ship.theseus.playlist.uicomponent.D;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kntr.base.localization.NumberFormat_androidKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.android.log.BLog;
import tv.danmaku.bili.widget.VectorTextView;
import tv.danmaku.biliplayerv2.NewPlayerUtilsKt;

/* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.uicomponent.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/uicomponent/i.class */
@StabilityInferred(parameters = 0)
public final class C6260i extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final D.h f96047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f96048b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f96049c = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final ArrayList<D.g.b> f96050d = new ArrayList<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<PlaylistRepository.b> f96051e = StateFlowKt.MutableStateFlow((Object) null);

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.uicomponent.i$a */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/uicomponent/i$a.class */
    public interface a {
        void a(@NotNull MultiTypeMedia multiTypeMedia);

        void b(@NotNull MultiTypeMedia multiTypeMedia, @NotNull Rect rect);

        void c(@NotNull MultiTypeMedia multiTypeMedia);
    }

    public C6260i(@NotNull D.h hVar, int i7) {
        this.f96047a = hVar;
        this.f96048b = i7;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object N(@org.jetbrains.annotations.NotNull java.util.List r9, @org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.playlist.uicomponent.C6260i.N(java.util.List, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f96050d.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i7) {
        return (i7 >= this.f96050d.size() || i7 < 0) ? -1 : this.f96050d.get(i7).f95985b;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(@NotNull RecyclerView.ViewHolder viewHolder, int i7) {
        String str;
        TintTextView tintTextView;
        String string;
        int i8;
        SocializeInfo socializeInfoO;
        SocializeInfo socializeInfoO2;
        List<Ou0.c> list;
        Ou0.c cVar;
        int itemViewType = getItemViewType(i7);
        if (itemViewType != 1) {
            if (itemViewType != 2) {
                if (itemViewType != 3) {
                    return;
                }
                C6261j c6261j = viewHolder instanceof C6261j ? (C6261j) viewHolder : null;
                if (c6261j != null) {
                    BLog.i("PlaylistMediaBottomHolder-bind", "[theseus-playlist-PlaylistMediaBottomHolder-bind] PlaylistMediaBottomHolder bind");
                    Job job = c6261j.f96053b;
                    if (job != null) {
                        Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                    }
                    c6261j.f96053b = BuildersKt.launch$default(c6261j.f96054c, (CoroutineContext) null, (CoroutineStart) null, new PlaylistMediaBottomHolder$bind$1(this.f96051e, c6261j, null), 3, (Object) null);
                    return;
                }
                return;
            }
            Object obj = this.f96050d.get(i7).f95984a;
            if ((obj instanceof Ou0.c) && (viewHolder instanceof ViewOnClickListenerC6262k)) {
                ViewOnClickListenerC6262k viewOnClickListenerC6262k = (ViewOnClickListenerC6262k) viewHolder;
                Ou0.c cVar2 = (Ou0.c) obj;
                D.g.b bVar = (D.g.b) CollectionsKt.getOrNull(this.f96050d, i7 - cVar2.f18102p);
                Object obj2 = bVar != null ? bVar.f95984a : null;
                MultiTypeMedia multiTypeMedia = null;
                if (obj2 instanceof MultiTypeMedia) {
                    multiTypeMedia = (MultiTypeMedia) obj2;
                }
                viewOnClickListenerC6262k.f96057c = cVar2;
                viewOnClickListenerC6262k.f96058d = multiTypeMedia;
                boolean z6 = (multiTypeMedia == null || (list = multiTypeMedia.f95225M) == null || (cVar = (Ou0.c) CollectionsKt.getOrNull(list, multiTypeMedia.f95252z)) == null || cVar.f18089b != cVar2.f18089b || !multiTypeMedia.f95251y) ? false : true;
                viewOnClickListenerC6262k.f96055a.f19348b.setText(cVar2.f18096j);
                if (!z6) {
                    viewOnClickListenerC6262k.f96055a.f19348b.setTextColor(ContextCompat.getColor(viewOnClickListenerC6262k.itemView.getContext(), R$color.Text1));
                    return;
                }
                TintTextView tintTextView2 = viewOnClickListenerC6262k.f96055a.f19348b;
                tintTextView2.setTextColor(ContextCompat.getColor(viewOnClickListenerC6262k.itemView.getContext(), 2131102728));
                tintTextView2.setText(com.bilibili.ship.theseus.playlist.util.e.b(tintTextView2, tintTextView2.getContext()));
                return;
            }
            return;
        }
        Object obj3 = this.f96050d.get(i7).f95984a;
        if ((obj3 instanceof MultiTypeMedia) && (viewHolder instanceof m)) {
            D.g.b bVar2 = (D.g.b) CollectionsKt.getOrNull(this.f96050d, i7 - 1);
            int i9 = bVar2 != null ? bVar2.f95985b : 1;
            m mVar = (m) viewHolder;
            MultiTypeMedia multiTypeMedia2 = (MultiTypeMedia) obj3;
            boolean z7 = i9 == 2;
            boolean z8 = i7 != this.f96050d.size() - this.f96049c;
            boolean z9 = i7 != 0;
            mVar.f96064d = multiTypeMedia2;
            Context context = mVar.f96061a.f19324a.getContext();
            if (!Intrinsics.areEqual(multiTypeMedia2.f95233f, mVar.f96065e)) {
                String str2 = multiTypeMedia2.f95233f;
                mVar.f96065e = str2;
                if (multiTypeMedia2.r()) {
                    mVar.f96061a.f19327d.setVisibility(0);
                    mVar.f96061a.f19345w.setVisibility(8);
                    BiliImageLoader.INSTANCE.with(context).url(str2).into(mVar.f96061a.f19326c);
                } else {
                    mVar.f96061a.f19345w.setVisibility(0);
                    mVar.f96061a.f19327d.setVisibility(8);
                    BiliImageLoader.INSTANCE.with(context).url(str2).into(mVar.f96061a.f19344v);
                }
            }
            long j7 = 1000;
            String playTime = NumberFormat.formatPlayTime(multiTypeMedia2.f95234g * j7);
            if (playTime.length() > 0) {
                if (multiTypeMedia2.r()) {
                    mVar.f96061a.f19328e.setText(playTime);
                } else {
                    mVar.f96061a.f19346x.setText(playTime);
                }
            }
            Context context2 = mVar.itemView.getContext();
            Pu0.g gVar = mVar.f96061a;
            LinearLayout linearLayout = gVar.f19330g;
            TextView textView = gVar.f19331i;
            ImageView imageView = gVar.h;
            if (multiTypeMedia2.e() != null) {
                int iA = multiTypeMedia2.e().a();
                if (iA == 1) {
                    linearLayout.setVisibility(0);
                    textView.setText(multiTypeMedia2.e().c());
                    imageView.setVisibility(8);
                    linearLayout.setPadding(NewPlayerUtilsKt.toPx(2), 0, NewPlayerUtilsKt.toPx(2), 0);
                } else if (iA == 4) {
                    linearLayout.setVisibility(0);
                    textView.setText(multiTypeMedia2.e().c());
                    IconTextDrawable iconDrawable = IconFont.getIconDrawable(multiTypeMedia2.e().b(), -1);
                    if (iconDrawable != null) {
                        imageView.setVisibility(0);
                        imageView.setImageDrawable(iconDrawable);
                    }
                    linearLayout.setPadding(NewPlayerUtilsKt.toPx(2), 0, NewPlayerUtilsKt.toPx(2), 0);
                } else {
                    linearLayout.setVisibility(8);
                }
            } else if (multiTypeMedia2.f95220H) {
                linearLayout.setVisibility(0);
                textView.setText(context2.getString(2131851654));
                imageView.setVisibility(0);
                imageView.setImageResource(2131238743);
            } else {
                Ou0.c cVar3 = (Ou0.c) CollectionsKt.firstOrNull(multiTypeMedia2.f95225M);
                if (cVar3 == null || (str = cVar3.f18098l) == null || str.length() <= 0) {
                    linearLayout.setVisibility(8);
                    textView.setText("");
                    imageView.setVisibility(8);
                } else {
                    linearLayout.setVisibility(0);
                    Ou0.c cVar4 = (Ou0.c) CollectionsKt.firstOrNull(multiTypeMedia2.f95225M);
                    textView.setText(cVar4 != null ? cVar4.f18098l : null);
                    imageView.setVisibility(8);
                }
            }
            textView.setIncludeFontPadding(false);
            mVar.f96061a.f19325b.setVisibility(multiTypeMedia2.p() > 1 ? 0 : 8);
            ImageView imageView2 = mVar.f96061a.f19325b;
            boolean z10 = multiTypeMedia2.f95250x;
            imageView2.setRotation(z10 ? 180.0f : 0.0f);
            mVar.f96061a.f19335m.setVisibility((z10 || !z8) ? 8 : 0);
            Context context3 = mVar.itemView.getContext();
            Pu0.g gVar2 = mVar.f96061a;
            TintTextView tintTextView3 = gVar2.f19333k;
            final LottieAnimationView lottieAnimationView = gVar2.f19329f;
            boolean z11 = multiTypeMedia2.f95222J;
            boolean z12 = multiTypeMedia2.f95251y;
            String str3 = multiTypeMedia2.f95247u;
            if (!z12 || z10) {
                if (z11) {
                    tintTextView3.setText(multiTypeMedia2.f95223K);
                } else {
                    tintTextView3.setText(str3);
                }
                lottieAnimationView.setVisibility(8);
                lottieAnimationView.pauseAnimation();
            } else {
                if (z11) {
                    tintTextView3.setText(com.bilibili.ship.theseus.playlist.util.e.a(NewPlayerUtilsKt.toPx(16.0f), multiTypeMedia2.f95223K));
                } else {
                    tintTextView3.setText(com.bilibili.ship.theseus.playlist.util.e.a(NewPlayerUtilsKt.toPx(16.0f), str3));
                }
                lottieAnimationView.setVisibility(0);
                lottieAnimationView.post(new Runnable(lottieAnimationView) { // from class: com.bilibili.ship.theseus.playlist.uicomponent.l

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final LottieAnimationView f96059a;

                    {
                        this.f96059a = lottieAnimationView;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f96059a.playAnimation();
                    }
                });
            }
            int i10 = multiTypeMedia2.s() ? R$color.Ga4 : z12 ? 2131102728 : R$color.Text1;
            tintTextView3.setTypeface(z12 ? Typeface.DEFAULT_BOLD : Typeface.DEFAULT);
            tintTextView3.setTextColor(ContextCompat.getColor(context3, i10));
            tintTextView3.setMaxLines((multiTypeMedia2.t() || multiTypeMedia2.u()) ? 1 : 2);
            TintTextView tintTextView4 = mVar.f96061a.f19343u;
            boolean zT = multiTypeMedia2.t();
            boolean z13 = multiTypeMedia2.f95219G;
            if (zT) {
                if (z13 && multiTypeMedia2.f95225M.size() == 1) {
                    tintTextView4.setVisibility(0);
                    tintTextView4.setText(((Ou0.c) CollectionsKt.first(multiTypeMedia2.f95225M)).f18096j);
                    tintTextView4.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                } else {
                    tintTextView4.setVisibility(8);
                }
            } else if (mVar.f96063c == 1) {
                j.d dVar = com.bilibili.playerbizcommon.utils.j.f80293d;
                String strA = com.bilibili.playerbizcommon.utils.j.a(multiTypeMedia2.f95243q * j7, context3);
                tintTextView4.setVisibility(strA.length() > 0 ? 0 : 8);
                tintTextView4.setText(strA);
            } else {
                Upper upper = multiTypeMedia2.f95249w;
                String str4 = upper != null ? upper.f95324f : null;
                if (str4 == null || str4.length() == 0) {
                    tintTextView4.setVisibility(8);
                } else {
                    tintTextView4.setVisibility(0);
                    tintTextView4.setText(str4);
                    Drawable drawable = AppCompatResources.getDrawable(context3, 2131235260);
                    if (drawable != null) {
                        drawable.setTint(ContextCompat.getColor(context3, R$color.Graph_medium));
                    } else {
                        drawable = null;
                    }
                    tintTextView4.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
                }
            }
            if ((multiTypeMedia2.u() || multiTypeMedia2.t()) && !z13) {
                mVar.f96061a.f19339q.setVisibility(8);
                tintTextView = mVar.f96061a.f19341s;
            } else {
                mVar.f96061a.f19341s.setVisibility(8);
                tintTextView = mVar.f96061a.f19339q;
            }
            tintTextView.setVisibility(0);
            boolean z14 = multiTypeMedia2.f95225M.size() == 1 && ((Ou0.c) CollectionsKt.first(multiTypeMedia2.f95225M)).f18099m;
            if (z13) {
                String str5 = multiTypeMedia2.f95218F;
                string = str5;
                if (z14) {
                    string = context3.getString(2131851636, str5);
                }
            } else if (multiTypeMedia2.t()) {
                string = multiTypeMedia2.f95237k;
            } else {
                string = "";
                if (multiTypeMedia2.u()) {
                    PugvInfo pugvInfoM = multiTypeMedia2.m();
                    string = "";
                    if (pugvInfoM != null) {
                        string = pugvInfoM.f95296g;
                        if (string == null) {
                            string = "";
                        }
                    }
                }
            }
            tintTextView.setText(string);
            if (z14) {
                tintTextView.setTextColor(ContextCompat.getColor(context3, R$color.Brand_pink));
            } else {
                tintTextView.setTextColor(ContextCompat.getColor(context3, R$color.Text3));
            }
            if (mVar.p0()) {
                mVar.f96061a.f19342t.setVisibility(8);
            } else {
                mVar.f96061a.f19342t.setVisibility(0);
                MultiTypeMedia multiTypeMedia3 = mVar.f96064d;
                if (multiTypeMedia3 == null || (socializeInfoO2 = multiTypeMedia3.o()) == null || socializeInfoO2.b() != 1) {
                    MultiTypeMedia multiTypeMedia4 = mVar.f96064d;
                    i8 = (multiTypeMedia4 == null || !multiTypeMedia4.r()) ? 2131235038 : 2131234407;
                } else {
                    i8 = 2131235257;
                }
                mVar.f96061a.f19342t.setLeftCompoundDrawable(i8, R$color.Ga5, NewPlayerUtilsKt.toPx(16.0f), NewPlayerUtilsKt.toPx(16.0f));
                VectorTextView vectorTextView = mVar.f96061a.f19342t;
                MultiTypeMedia multiTypeMedia5 = mVar.f96064d;
                vectorTextView.setText((multiTypeMedia5 == null || (socializeInfoO = multiTypeMedia5.o()) == null) ? null : socializeInfoO.c());
            }
            mVar.f96061a.f19340r.setVisibility(mVar.p0() ? 4 : 0);
            TintTextView tintTextView5 = mVar.f96061a.f19340r;
            SocializeInfo socializeInfoO3 = multiTypeMedia2.o();
            tintTextView5.setText(NumberFormat_androidKt.format$default(socializeInfoO3 != null ? Long.valueOf(socializeInfoO3.f95310c) : null, "0", 0, 2, (Object) null));
            if (z13 || multiTypeMedia2.k() <= 0.0d) {
                mVar.f96061a.f19334l.setVisibility(8);
            } else {
                mVar.f96061a.f19334l.setVisibility(0);
                mVar.f96061a.f19334l.setProgress((int) (multiTypeMedia2.k() * ((double) 100)));
            }
            mVar.f96061a.f19332j.setVisibility(0);
            mVar.f96061a.f19332j.setImageResource(2131235704);
            mVar.f96061a.f19338p.setVisibility(z9 ? 0 : 8);
            mVar.f96061a.f19336n.setVisibility(z7 ? 0 : 8);
            ViewExposureLayoutInfoCollectorKt.setExposureLayoutInfoReceiver(viewHolder.itemView, multiTypeMedia2.f95227O);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public final RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup viewGroup, int i7) {
        RecyclerView.ViewHolder mVar;
        D.h hVar = this.f96047a;
        if (i7 != 1) {
            mVar = i7 != 2 ? i7 != 3 ? new m(Pu0.g.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false), null, 0) : new C6261j(Pu0.f.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false)) : new ViewOnClickListenerC6262k(Pu0.h.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false), hVar);
        } else {
            int i8 = m.f96060f;
            mVar = new m(Pu0.g.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false), hVar, this.f96048b);
        }
        return mVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewDetachedFromWindow(@NotNull RecyclerView.ViewHolder viewHolder) {
        super.onViewDetachedFromWindow(viewHolder);
        if (viewHolder instanceof C6261j) {
            C6261j c6261j = (C6261j) viewHolder;
            c6261j.getClass();
            BLog.i("PlaylistMediaBottomHolder-unbind", "[theseus-playlist-PlaylistMediaBottomHolder-unbind] PlaylistMediaBottomHolder unbind");
            Job job = c6261j.f96053b;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewRecycled(@NotNull RecyclerView.ViewHolder viewHolder) {
        super.onViewRecycled(viewHolder);
        if (viewHolder instanceof C6261j) {
            C6261j c6261j = (C6261j) viewHolder;
            c6261j.getClass();
            BLog.i("PlaylistMediaBottomHolder-unbind", "[theseus-playlist-PlaylistMediaBottomHolder-unbind] PlaylistMediaBottomHolder unbind");
            Job job = c6261j.f96053b;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
        }
    }
}
