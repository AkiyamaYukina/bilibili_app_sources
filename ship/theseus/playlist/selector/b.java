package com.bilibili.ship.theseus.playlist.selector;

import android.content.Context;
import android.content.res.Resources;
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
import com.bilibili.chatroom.ui.ChatPlayerMsgFragment;
import com.bilibili.framework.exposure.core.collecter.ViewExposureLayoutInfoCollectorKt;
import com.bilibili.iconfont.IconFont;
import com.bilibili.iconfont.IconTextDrawable;
import com.bilibili.lib.image2.BiliImageLoader;
import com.bilibili.lib.theme.R$color;
import com.bilibili.magicasakura.widgets.TintTextView;
import com.bilibili.playerbizcommon.utils.j;
import com.bilibili.ship.theseus.playlist.api.MultiTypeMedia;
import com.bilibili.ship.theseus.playlist.api.SocializeInfo;
import com.bilibili.ship.theseus.playlist.api.Upper;
import com.bilibili.ship.theseus.playlist.selector.k;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.bili.widget.VectorTextView;
import tv.danmaku.biliplayerv2.NewPlayerUtilsKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/selector/b.class */
@StabilityInferred(parameters = 0)
public final class b extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final k.e f95855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f95856b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final ArrayList<k.d.b> f95857c = new ArrayList<>();

    public b(@NotNull k.e eVar, int i7) {
        this.f95855a = eVar;
        this.f95856b = i7;
    }

    public final boolean N(int i7) {
        int itemViewType = getItemViewType(i7);
        Object obj = this.f95857c.get(i7).f95897a;
        boolean z6 = false;
        if (itemViewType == 2) {
            z6 = false;
            if (obj instanceof Ou0.c) {
                z6 = false;
                if (((Ou0.c) obj).f18102p % 2 != 0) {
                    z6 = true;
                }
            }
        }
        return z6;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f95857c.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i7) {
        return (i7 >= this.f95857c.size() || i7 < 0) ? -1 : this.f95857c.get(i7).f95898b;
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
        String string;
        MultiTypeMedia multiTypeMedia;
        MultiTypeMedia multiTypeMedia2;
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
                Object obj = this.f95857c.get(i7).f95897a;
                if ((obj instanceof k.d.a) && (viewHolder instanceof d)) {
                    k.d.a aVar = (k.d.a) obj;
                    Pu0.i iVar = ((d) viewHolder).f95862a;
                    Context context = iVar.f19349a.getContext();
                    iVar.f19351c.setText(context.getString(2131851649));
                    iVar.f19350b.setVisibility(aVar.f95896d ? 0 : 8);
                    TextView textView = iVar.f19350b;
                    Resources resources = context.getResources();
                    int i9 = aVar.f95895c;
                    textView.setText(resources.getQuantityString(2131689807, i9, Integer.valueOf(i9)));
                    return;
                }
                return;
            }
            Object obj2 = this.f95857c.get(i7).f95897a;
            if ((obj2 instanceof Ou0.c) && (viewHolder instanceof c)) {
                c cVar2 = (c) viewHolder;
                Ou0.c cVar3 = (Ou0.c) obj2;
                MultiTypeMedia multiTypeMedia3 = (MultiTypeMedia) this.f95857c.get(i7 - cVar3.f18102p).f95897a;
                cVar2.f95860c = cVar3;
                cVar2.f95861d = multiTypeMedia3;
                boolean z6 = (multiTypeMedia3 == null || (list = multiTypeMedia3.f95225M) == null || (cVar = (Ou0.c) CollectionsKt.getOrNull(list, multiTypeMedia3.f95252z)) == null || cVar.f18089b != cVar3.f18089b || !multiTypeMedia3.f95251y) ? false : true;
                cVar2.f95858a.f19373b.setText(cVar3.f18096j);
                if (!z6) {
                    cVar2.f95858a.f19373b.setSelected(false);
                    return;
                }
                TintTextView tintTextView = cVar2.f95858a.f19373b;
                tintTextView.setSelected(true);
                tintTextView.setText(com.bilibili.ship.theseus.playlist.util.e.b(tintTextView, tintTextView.getContext()));
                return;
            }
            return;
        }
        Object obj3 = this.f95857c.get(i7).f95897a;
        if ((obj3 instanceof MultiTypeMedia) && (viewHolder instanceof f)) {
            k.d.b bVar = (k.d.b) CollectionsKt.getOrNull(this.f95857c, i7 - 1);
            int i10 = bVar != null ? bVar.f95898b : 1;
            f fVar = (f) viewHolder;
            MultiTypeMedia multiTypeMedia4 = (MultiTypeMedia) obj3;
            boolean z7 = i10 == 2;
            fVar.f95868d = multiTypeMedia4;
            Context context2 = fVar.f95865a.f19352a.getContext();
            if (!Intrinsics.areEqual(multiTypeMedia4.f95233f, fVar.f95869e)) {
                String str2 = multiTypeMedia4.f95233f;
                fVar.f95869e = str2;
                if (multiTypeMedia4.r()) {
                    fVar.f95865a.f19356e.setVisibility(0);
                    fVar.f95865a.f19370t.setVisibility(8);
                    BiliImageLoader.INSTANCE.with(context2).url(str2).into(fVar.f95865a.f19354c);
                } else {
                    fVar.f95865a.f19370t.setVisibility(0);
                    fVar.f95865a.f19356e.setVisibility(8);
                    BiliImageLoader.INSTANCE.with(context2).url(str2).into(fVar.f95865a.f19368r);
                }
            }
            long j7 = 1000;
            String playTime = NumberFormat.formatPlayTime(multiTypeMedia4.f95234g * j7);
            if (playTime.length() > 0) {
                if (multiTypeMedia4.r()) {
                    fVar.f95865a.f19357f.setText(playTime);
                } else {
                    fVar.f95865a.f19371u.setText(playTime);
                }
            }
            Context context3 = fVar.itemView.getContext();
            Pu0.j jVar = fVar.f95865a;
            LinearLayout linearLayout = jVar.h;
            TextView textView2 = jVar.f19360j;
            ImageView imageView = jVar.f19359i;
            if (multiTypeMedia4.e() != null) {
                int iA = multiTypeMedia4.e().a();
                if (iA == 1) {
                    linearLayout.setVisibility(0);
                    textView2.setText(multiTypeMedia4.e().c());
                    imageView.setVisibility(8);
                    linearLayout.setPadding(NewPlayerUtilsKt.toPx(4), 0, NewPlayerUtilsKt.toPx(4), 0);
                } else if (iA == 4) {
                    linearLayout.setVisibility(0);
                    textView2.setText(multiTypeMedia4.e().c());
                    IconTextDrawable iconDrawable = IconFont.getIconDrawable(multiTypeMedia4.e().b(), -1);
                    if (iconDrawable != null) {
                        imageView.setVisibility(0);
                        imageView.setImageDrawable(iconDrawable);
                    }
                    linearLayout.setPadding(NewPlayerUtilsKt.toPx(2), 0, NewPlayerUtilsKt.toPx(4), 0);
                } else {
                    linearLayout.setVisibility(8);
                }
            } else if (multiTypeMedia4.f95220H) {
                linearLayout.setVisibility(0);
                textView2.setText(context3.getString(2131851654));
                imageView.setVisibility(0);
                imageView.setImageResource(2131238743);
            } else {
                Ou0.c cVar4 = (Ou0.c) CollectionsKt.firstOrNull(multiTypeMedia4.f95225M);
                if (cVar4 == null || (str = cVar4.f18098l) == null || str.length() <= 0) {
                    linearLayout.setVisibility(8);
                    textView2.setText("");
                    imageView.setVisibility(8);
                } else {
                    linearLayout.setVisibility(0);
                    Ou0.c cVar5 = (Ou0.c) CollectionsKt.firstOrNull(multiTypeMedia4.f95225M);
                    textView2.setText(cVar5 != null ? cVar5.f18098l : null);
                    imageView.setVisibility(8);
                }
            }
            textView2.setIncludeFontPadding(false);
            fVar.f95865a.f19353b.setVisibility(multiTypeMedia4.p() > 1 ? 0 : 8);
            ImageView imageView2 = fVar.f95865a.f19353b;
            boolean z8 = multiTypeMedia4.f95250x;
            imageView2.setRotation(z8 ? 180.0f : 0.0f);
            fVar.f95865a.f19363m.setVisibility(z8 ? 8 : 0);
            Context context4 = fVar.itemView.getContext();
            Pu0.j jVar2 = fVar.f95865a;
            TintTextView tintTextView2 = jVar2.f19361k;
            String str3 = multiTypeMedia4.f95247u;
            tintTextView2.setText(str3);
            boolean zS = multiTypeMedia4.s();
            boolean z9 = multiTypeMedia4.f95251y;
            tintTextView2.setTextColor(ContextCompat.getColor(context4, zS ? R$color.Ga4 : z9 ? 2131102728 : 17170443));
            TintTextView tintTextView3 = fVar.f95865a.f19367q;
            boolean zT = multiTypeMedia4.t();
            boolean z10 = multiTypeMedia4.f95219G;
            if (zT) {
                if (z10 && multiTypeMedia4.f95225M.size() == 1) {
                    tintTextView3.setVisibility(0);
                    tintTextView3.setText(((Ou0.c) CollectionsKt.first(multiTypeMedia4.f95225M)).f18096j);
                    tintTextView3.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                } else {
                    tintTextView3.setVisibility(8);
                }
            } else if (fVar.f95867c == 1) {
                j.d dVar = com.bilibili.playerbizcommon.utils.j.f80293d;
                String strA = com.bilibili.playerbizcommon.utils.j.a(multiTypeMedia4.f95243q * j7, context4);
                tintTextView3.setVisibility(strA.length() > 0 ? 0 : 8);
                tintTextView3.setText(strA);
            } else {
                Upper upper = multiTypeMedia4.f95249w;
                String str4 = upper != null ? upper.f95324f : null;
                if (str4 == null || str4.length() == 0) {
                    tintTextView3.setVisibility(8);
                } else {
                    tintTextView3.setVisibility(0);
                    tintTextView3.setText(str4);
                    Drawable drawable = AppCompatResources.getDrawable(context4, 2131235260);
                    if (drawable != null) {
                        drawable.setTint(ContextCompat.getColor(context4, R$color.Graph_medium));
                    } else {
                        drawable = null;
                    }
                    tintTextView3.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
                }
            }
            TintTextView tintTextView4 = fVar.f95865a.f19365o;
            tintTextView4.setVisibility((multiTypeMedia4.t() || z10) ? 0 : 8);
            boolean z11 = multiTypeMedia4.f95225M.size() == 1 && ((Ou0.c) CollectionsKt.first(multiTypeMedia4.f95225M)).f18099m;
            if (z10) {
                String str5 = multiTypeMedia4.f95218F;
                string = str5;
                if (z11) {
                    string = context4.getString(2131851636, str5);
                }
            } else {
                string = multiTypeMedia4.t() ? multiTypeMedia4.f95237k : "";
            }
            tintTextView4.setText(string);
            if (z11) {
                tintTextView4.setTextColor(ContextCompat.getColor(context4, R$color.Brand_pink));
            } else {
                tintTextView4.setTextColor(ContextCompat.getColor(context4, R$color.Text3));
            }
            final LottieAnimationView lottieAnimationView = jVar2.f19358g;
            if (!z9 || z8) {
                tintTextView2.setText(str3);
                lottieAnimationView.setVisibility(8);
                lottieAnimationView.pauseAnimation();
            } else {
                tintTextView2.setText(com.bilibili.ship.theseus.playlist.util.e.a(NewPlayerUtilsKt.toPx(16.0f), str3));
                lottieAnimationView.setVisibility(0);
                final int i11 = 0;
                lottieAnimationView.post(new Runnable(lottieAnimationView, i11) { // from class: com.bilibili.ship.theseus.playlist.selector.e

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final int f95863a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final Object f95864b;

                    {
                        this.f95863a = i11;
                        this.f95864b = lottieAnimationView;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (this.f95863a) {
                            case 0:
                                ((LottieAnimationView) this.f95864b).playAnimation();
                                break;
                            default:
                                ((ChatPlayerMsgFragment) this.f95864b).lf();
                                break;
                        }
                    }
                });
            }
            MultiTypeMedia multiTypeMedia5 = fVar.f95868d;
            if ((multiTypeMedia5 == null || !multiTypeMedia5.t()) && (((multiTypeMedia = fVar.f95868d) == null || !multiTypeMedia.u()) && ((multiTypeMedia2 = fVar.f95868d) == null || !multiTypeMedia2.f95219G))) {
                fVar.f95865a.f19366p.setVisibility(0);
                MultiTypeMedia multiTypeMedia6 = fVar.f95868d;
                if (multiTypeMedia6 == null || (socializeInfoO2 = multiTypeMedia6.o()) == null || socializeInfoO2.b() != 1) {
                    MultiTypeMedia multiTypeMedia7 = fVar.f95868d;
                    i8 = (multiTypeMedia7 == null || !multiTypeMedia7.r()) ? 2131235038 : 2131234407;
                } else {
                    i8 = 2131235257;
                }
                fVar.f95865a.f19366p.setLeftCompoundDrawable(i8, R$color.Ga5, NewPlayerUtilsKt.toPx(16.0f), NewPlayerUtilsKt.toPx(16.0f));
                VectorTextView vectorTextView = fVar.f95865a.f19366p;
                MultiTypeMedia multiTypeMedia8 = fVar.f95868d;
                vectorTextView.setText((multiTypeMedia8 == null || (socializeInfoO = multiTypeMedia8.o()) == null) ? null : socializeInfoO.c());
            } else {
                fVar.f95865a.f19366p.setVisibility(4);
            }
            if (z10 || multiTypeMedia4.k() <= 0.0d) {
                fVar.f95865a.f19362l.setVisibility(8);
            } else {
                fVar.f95865a.f19362l.setVisibility(0);
                fVar.f95865a.f19362l.setProgress((int) (multiTypeMedia4.k() * ((double) 100)));
            }
            fVar.f95865a.f19364n.setVisibility(z7 ? 0 : 8);
        }
        ViewExposureLayoutInfoCollectorKt.setExposureLayoutInfoReceiver(viewHolder.itemView, this.f95857c.get(i7).f95900d);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public final RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup viewGroup, int i7) {
        k.e eVar = this.f95855a;
        return i7 != 1 ? i7 != 2 ? i7 != 3 ? new com.bilibili.ship.theseus.playlist.uicomponent.m(Pu0.g.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false), null, 0) : new d(Pu0.i.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false)) : new c(Pu0.k.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false), eVar) : new f(Pu0.j.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false), eVar, this.f95856b);
    }
}
