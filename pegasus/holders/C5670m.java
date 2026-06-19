package com.bilibili.pegasus.holders;

import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.app.comm.list.widget.image.ListPlaceHolderImageView;
import com.bilibili.app.comm.list.widget.layout.PriorityRowConstraintLayout;
import com.bilibili.app.comm.list.widget.tag.TagView;
import com.bilibili.app.comm.list.widget.tag.tagtinttext.TagTintTextView;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.lib.image2.view.BiliImageView;
import com.bilibili.lib.theme.R$color;
import com.bilibili.magicasakura.widgets.TintTextView;
import com.bilibili.pegasus.PegasusHolderData;
import com.bilibili.pegasus.compat.PegasusCoverStyle;
import com.bilibili.pegasus.data.component.AvatarData;
import com.bilibili.pegasus.data.component.DescButtonData;
import com.bilibili.pegasus.ext.view.TagExtKt;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import op0.C8249a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sp0.C8614c;
import tv.danmaku.bili.widget.VectorTextView;

/* JADX INFO: renamed from: com.bilibili.pegasus.holders.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/m.class */
@StabilityInferred(parameters = 0)
public class C5670m extends AbstractC5652d<fp0.u> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final aq0.O0 f77894f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final TintTextView f77895g;

    @Nullable
    public final VectorTextView h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public final VectorTextView f77896i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public final TagTintTextView f77897j;

    /* JADX WARN: Multi-variable type inference failed */
    public C5670m(@NotNull aq0.O0 o02) {
        super(o02.f53786a);
        this.f77894f = o02;
        this.itemView.setOnClickListener(new View.OnClickListener(this) { // from class: com.bilibili.pegasus.holders.i

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final C5670m f77876a;

            {
                this.f77876a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C8249a.f(this.f77876a, null, null, null, false, null, null, 255);
            }
        });
        this.itemView.setOnLongClickListener(new View.OnLongClickListener(this) { // from class: com.bilibili.pegasus.holders.j

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final C5670m f77880a;

            {
                this.f77880a = this;
            }

            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                C5670m c5670m = this.f77880a;
                rp0.p.c(c5670m, true, ListExtentionsKt.getGlobalRect(c5670m.f77894f.f53797m));
                return true;
            }
        });
        o02.f53797m.setOnClickListener(new View.OnClickListener(this) { // from class: com.bilibili.pegasus.holders.k

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final C5670m f77885a;

            {
                this.f77885a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C5670m c5670m = this.f77885a;
                rp0.p.c(c5670m, false, ListExtentionsKt.getGlobalRect(c5670m.f77894f.f53797m));
            }
        });
        if (!androidx.appcompat.app.n.a(Thread.currentThread())) {
            o02.f53800p.inflate();
        }
        this.f77895g = o02.f53801q;
        this.h = o02.f53790e;
        this.f77896i = o02.f53791f;
        this.f77897j = o02.f53792g;
    }

    public final void onBind(PegasusHolderData pegasusHolderData, List list) {
        fp0.u uVar = (fp0.u) pegasusHolderData;
        if (list.contains("PAYLOAD_UPDATE_TRANSLATE")) {
            z0(uVar);
        } else {
            super/*com.bilibili.pegasus.PegasusHolder*/.onBind(uVar, list);
        }
    }

    @Override // com.bilibili.pegasus.holders.AbstractC5652d
    @Nullable
    public final TextView q0() {
        return this.h;
    }

    @Override // com.bilibili.pegasus.holders.AbstractC5652d
    @Nullable
    public final TextView r0() {
        return this.f77896i;
    }

    @Override // com.bilibili.pegasus.holders.AbstractC5652d
    @Nullable
    public final TextView s0() {
        return this.f77897j;
    }

    @Override // com.bilibili.pegasus.holders.AbstractC5652d
    @NotNull
    public final TextView t0() {
        return this.f77895g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void y0(@NotNull final fp0.u uVar) {
        p0();
        aq0.O0 o02 = this.f77894f;
        ListPlaceHolderImageView listPlaceHolderImageView = o02.f53788c;
        PegasusCoverStyle pegasusCoverStyle = PegasusCoverStyle.INSTANCE;
        listPlaceHolderImageView.setAspectRatio(pegasusCoverStyle.getCoverRatio());
        ListExtentionsKt.setTextWithIcon$default(o02.f53790e, uVar.getCoverLeftText1(), uVar.getCoverLeftIcon1(), R$color.Wh0_u, 0.0f, 0.0f, 48, (Object) null);
        ListExtentionsKt.setTextWithIcon$default(o02.f53791f, uVar.getCoverLeftText2(), uVar.getCoverLeftIcon2(), R$color.Wh0_u, 0.0f, 0.0f, 48, (Object) null);
        TagExtKt.setCoverLabelText(o02.f53792g, uVar.getCoverRightText(), uVar.l(), null, uVar.m(), R$color.Wh0_u);
        PriorityRowConstraintLayout priorityRowConstraintLayout = o02.f53789d;
        int iK = uVar.k();
        Integer numValueOf = Integer.valueOf(iK);
        if (iK <= 0) {
            numValueOf = null;
        }
        vi.a.a(priorityRowConstraintLayout, numValueOf != null ? numValueOf.intValue() : 123);
        TagExtKt.showStoryTag(o02.f53800p, this.itemView, uVar.s());
        int iG = uVar.g();
        ListPlaceHolderImageView listPlaceHolderImageView2 = o02.f53799o;
        ListPlaceHolderImageView listPlaceHolderImageView3 = o02.f53788c;
        if (iG == 1) {
            C8614c.b(listPlaceHolderImageView3, uVar.getCover());
            C8614c.f(listPlaceHolderImageView2, uVar.getCover(), null, false, 14);
            listPlaceHolderImageView2.setVisibility(0);
        } else {
            listPlaceHolderImageView2.setVisibility(8);
            String cover = uVar.getCover();
            String strH = uVar.h();
            String str = uVar.t() ? "pegasus-android-v4" : "pegasus-android-v2";
            int i7 = T0.f77631a;
            C8614c.e(listPlaceHolderImageView3, cover, strH, str, i7, (int) (i7 / pegasusCoverStyle.getCoverRatio()), o02.h, null, new C5668l(this), uVar.t() ? "pegasus-android-gif-v4" : "pegasus-android-gif", 320);
        }
        z0(uVar);
        jp0.e eVarP = uVar.q() == 1 ? uVar.p() : uVar.f();
        jp0.e eVarF = uVar.q() == 1 ? uVar.f() : uVar.p();
        TagView tagView = o02.f53787b;
        boolean zDisplayTag$default = TagExtKt.displayTag$default(tagView, eVarP, false, null, false, null, 30, null);
        TagTintTextView tagTintTextView = o02.f53794j;
        boolean zDisplayTag$default2 = TagExtKt.displayTag$default(tagTintTextView, eVarF, null, null, false, false, false, null, TagExtKt.toImageTag$default(eVarF, 0, 3, true, 1, null), null, true, 382, null);
        TintTextView tintTextView = o02.f53798n;
        String strN = uVar.n();
        tintTextView.setVisibility((strN == null || StringsKt.isBlank(strN)) ? 8 : 0);
        tintTextView.setText(uVar.n());
        tintTextView.setOnClickListener(new View.OnClickListener(uVar, this) { // from class: com.bilibili.pegasus.holders.g

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final fp0.u f77867a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final C5670m f77868b;

            {
                this.f77867a = uVar;
                this.f77868b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                fp0.u uVar2 = this.f77867a;
                C5670m c5670m = this.f77868b;
                DescButtonData descButton = uVar2.getDescButton();
                String uri = descButton != null ? descButton.getUri() : null;
                if (uri == null || StringsKt.isBlank(uri)) {
                    C8249a.f(c5670m, null, null, null, false, null, null, 255);
                } else {
                    C8249a.g(c5670m, uVar2);
                }
            }
        });
        tagTintTextView.setPadding(tagTintTextView.getPaddingLeft(), tagTintTextView.getPaddingTop(), tagTintTextView.getPaddingRight(), (!zDisplayTag$default || zDisplayTag$default2) ? 0 : 1);
        tagTintTextView.setVisibility(zDisplayTag$default2 ? 0 : 8);
        TagExtKt.adjustTagSpacing(tagView, zDisplayTag$default, zDisplayTag$default2);
        TagExtKt.displayBadge(o02.f53793i, uVar.j());
        x0(o02.f53797m);
        final jp0.e eVar = eVarF;
        tagTintTextView.setOnClickListener(new View.OnClickListener(eVar, this, uVar) { // from class: com.bilibili.pegasus.holders.h

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final jp0.e f77871a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final C5670m f77872b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final fp0.u f77873c;

            {
                this.f77871a = eVar;
                this.f77872b = this;
                this.f77873c = uVar;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                jp0.e eVar2 = this.f77871a;
                C5670m c5670m = this.f77872b;
                fp0.u uVar2 = this.f77873c;
                String strO = eVar2 != null ? eVar2.o() : null;
                if (strO == null || StringsKt.isBlank(strO)) {
                    C8249a.f(c5670m, null, null, null, false, null, null, 255);
                } else {
                    C8249a.i(c5670m, uVar2, eVar2);
                }
            }
        });
        AvatarData avatar = uVar.getAvatar();
        String cover2 = avatar != null ? avatar.getCover() : null;
        BiliImageView biliImageView = o02.f53795k;
        if (cover2 == null || StringsKt.isBlank(cover2)) {
            biliImageView.setVisibility(8);
            return;
        }
        biliImageView.setVisibility(0);
        AvatarData avatar2 = uVar.getAvatar();
        String cover3 = avatar2 != null ? avatar2.getCover() : null;
        AvatarData avatar3 = uVar.getAvatar();
        C8614c.a(biliImageView, cover3, avatar3 != null ? Integer.valueOf(avatar3.getType()) : null, ListExtentionsKt.toPx(4.0f), 0, 0, 24);
    }

    public final void z0(fp0.u uVar) {
        String translatedText;
        this.f77894f.f53801q.setText((!Intrinsics.areEqual(uVar.getTranslatedStatus(), "TRANSLATED") || (translatedText = uVar.getTranslatedText()) == null || StringsKt.isBlank(translatedText)) ? uVar.getTitle() : uVar.getTranslatedText());
    }
}
