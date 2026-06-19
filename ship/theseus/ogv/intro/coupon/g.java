package com.bilibili.ship.theseus.ogv.intro.coupon;

import I60.I;
import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.droid.StringUtil;
import com.bilibili.ship.theseus.ogv.pay.DialogCoupon;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import zu0.O;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/coupon/g.class */
@StabilityInferred(parameters = 0)
public final class g extends RecyclerView.Adapter<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final List<DialogCoupon> f92351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final I f92352b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f92353c;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/coupon/g$a.class */
    @StabilityInferred(parameters = 0)
    public static final class a extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f92354b = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final O f92355a;

        public a(@NotNull O o7) {
            super(o7.getRoot());
            this.f92355a = o7;
        }
    }

    public g(@NotNull List list, @NotNull I i7) {
        this.f92351a = list;
        this.f92352b = i7;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f92351a.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, final int i7) {
        ?? r9;
        a aVar = (a) viewHolder;
        DialogCoupon dialogCoupon = this.f92351a.get(i7);
        boolean z6 = i7 == this.f92353c;
        int i8 = this.f92351a.size() > 1 ? 0 : 8;
        O o7 = aVar.f92355a;
        h hVar = o7.f130537B;
        if (hVar != null) {
            String str = dialogCoupon.f94145d;
            SpannableString spannableString = new SpannableString(str);
            if (str != null && str.length() != 0) {
                Long l7 = dialogCoupon.f94143b;
                if ((l7 != null && l7.longValue() == 1) || (l7 != null && l7.longValue() == 2)) {
                    spannableString.setSpan(new StyleSpan(1), 0, 1, 17);
                    int length = str.length();
                    if (length > 0) {
                        boolean zIsNumeric = StringUtil.isNumeric(String.valueOf(str.charAt(0)));
                        r9 = zIsNumeric;
                        if (length > 1) {
                            r9 = zIsNumeric;
                            if (StringUtil.isNumeric(String.valueOf(str.charAt(1)))) {
                                r9 = 2;
                            }
                        }
                    } else {
                        r9 = 0;
                    }
                    if (length > 0) {
                        spannableString.setSpan(new AbsoluteSizeSpan(24, true), 0, r9 == true ? 1 : 0, 17);
                    } else if (length > r9) {
                        spannableString.setSpan(new AbsoluteSizeSpan(16, true), r9 == true ? 1 : 0, length, 18);
                    }
                } else {
                    int length2 = str.length();
                    if (length2 > 0) {
                        spannableString.setSpan(new AbsoluteSizeSpan(18, true), 0, length2, 18);
                    }
                }
            }
            hVar.f92356a.set(spannableString);
            hVar.f92357b.set(dialogCoupon.e());
            hVar.f92358c.set(dialogCoupon.f94147f);
            hVar.f92359d.set(dialogCoupon.f94148g);
            hVar.f92360e.set(Boolean.valueOf(z6));
            hVar.f92361f.set(Integer.valueOf(i8));
        }
        o7.executePendingBindings();
        aVar.itemView.setOnClickListener(new View.OnClickListener(this, i7) { // from class: com.bilibili.ship.theseus.ogv.intro.coupon.f

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final g f92349a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final int f92350b;

            {
                this.f92349a = this;
                this.f92350b = i7;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f92349a.f92352b.invoke(Integer.valueOf(this.f92350b));
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i7, List list) {
        a aVar = (a) viewHolder;
        if (list.isEmpty()) {
            super.onBindViewHolder(aVar, i7, list);
            return;
        }
        boolean z6 = i7 == this.f92353c;
        O o7 = aVar.f92355a;
        h hVar = o7.f130537B;
        if (hVar != null) {
            hVar.f92360e.set(Boolean.valueOf(z6));
        }
        o7.executePendingBindings();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i7) {
        int i8 = a.f92354b;
        O oInflate = O.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        oInflate.q(new h());
        return new a(oInflate);
    }
}
