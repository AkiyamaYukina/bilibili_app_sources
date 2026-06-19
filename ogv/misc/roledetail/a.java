package com.bilibili.ogv.misc.roledetail;

import Nl0.f;
import android.R;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import com.bilibili.lib.image2.view.BiliImageView;
import com.bilibili.ogv.misc.roledetail.BangumiRoleDetailActivity;
import com.bilibili.ogv.misc.roledetail.a;
import com.bilibili.ogv.misc.roledetail.roledetailapi.PersonInfoVo;
import com.bilibili.ogv.misc.roledetail.roledetailapi.PersonRelateContentVo;
import com.bilibili.ogv.misc.roledetail.roledetailapi.RoleDetailVo;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r2.C8509b;
import to.c;
import tv.danmaku.bili.widget.section.adapter.BaseSectionAdapter;
import tv.danmaku.bili.widget.section.holder.BaseViewHolder;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/roledetail/a.class */
@StabilityInferred(parameters = 0)
public final class a extends tv.danmaku.bili.widget.section.adapter.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final BangumiRoleDetailActivity f69250f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final RoleDetailVo f69251g;
    public int h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public c f69252i;

    /* JADX INFO: renamed from: com.bilibili.ogv.misc.roledetail.a$a, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/roledetail/a$a.class */
    @StabilityInferred(parameters = 0)
    public static final class C0423a extends BaseViewHolder {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public LinearLayout f69253b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public ExpandableTextView f69254c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public View f69255d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public TextView f69256e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public TextView f69257f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        public View f69258g;
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/roledetail/a$b.class */
    @StabilityInferred(parameters = 0)
    public static final class b extends BaseViewHolder {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final BiliImageView f69259b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final TextView f69260c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final TextView f69261d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public final TextView f69262e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public final TextView f69263f;

        public b(@NotNull View view, @NotNull a aVar) {
            super(view, aVar);
            this.f69259b = view.findViewById(2131298941);
            this.f69260c = (TextView) view.findViewById(2131308958);
            this.f69261d = (TextView) view.findViewById(2131312539);
            this.f69262e = (TextView) view.findViewById(2131303548);
            this.f69263f = (TextView) view.findViewById(2131297143);
        }
    }

    public a(@NotNull BangumiRoleDetailActivity bangumiRoleDetailActivity, @NotNull RoleDetailVo roleDetailVo) {
        this.f69250f = bangumiRoleDetailActivity;
        this.f69251g = roleDetailVo;
    }

    public final void fillSection(@NotNull BaseSectionAdapter.SectionManager sectionManager) {
        List<PersonRelateContentVo.Season> list;
        RoleDetailVo roleDetailVo = this.f69251g;
        if (roleDetailVo.getPersonInfoVo() != null) {
            sectionManager.addSectionWithNone(1, 101);
        }
        if (roleDetailVo.getPersonRelateContentVo() != null) {
            PersonRelateContentVo personRelateContentVo = roleDetailVo.getPersonRelateContentVo();
            if ((personRelateContentVo != null ? personRelateContentVo.f69280f : null) != null) {
                PersonRelateContentVo personRelateContentVo2 = roleDetailVo.getPersonRelateContentVo();
                if (((personRelateContentVo2 == null || (list = personRelateContentVo2.f69280f) == null) ? null : Integer.valueOf(list.size())).intValue() > 0) {
                    PersonRelateContentVo personRelateContentVo3 = roleDetailVo.getPersonRelateContentVo();
                    Integer numValueOf = null;
                    if (personRelateContentVo3 != null) {
                        List<PersonRelateContentVo.Season> list2 = personRelateContentVo3.f69280f;
                        numValueOf = null;
                        if (list2 != null) {
                            numValueOf = Integer.valueOf(list2.size());
                        }
                    }
                    sectionManager.addSectionWithNone(numValueOf.intValue(), 102);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v127, types: [com.bilibili.ogv.misc.roledetail.ExpandableTextView$b, com.bilibili.ogv.misc.roledetail.ExpandableTextView$d, java.lang.Object] */
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
    public final void onBindHolder(@NotNull final BaseViewHolder baseViewHolder, int i7, @NotNull View view) {
        List<PersonRelateContentVo.Season> list;
        String strB;
        boolean z6 = baseViewHolder instanceof C0423a;
        RoleDetailVo roleDetailVo = this.f69251g;
        int i8 = 8;
        if (!z6) {
            if (baseViewHolder instanceof b) {
                int indexInSection = getIndexInSection(i7);
                PersonRelateContentVo personRelateContentVo = roleDetailVo.getPersonRelateContentVo();
                if ((personRelateContentVo != null ? personRelateContentVo.f69280f : null) != null) {
                    PersonRelateContentVo.Season season = personRelateContentVo.f69280f.get(indexInSection);
                    b bVar = (b) baseViewHolder;
                    BiliImageView biliImageView = bVar.f69259b;
                    String str = season.f69281a;
                    BangumiRoleDetailActivity bangumiRoleDetailActivity = this.f69250f;
                    f.c(biliImageView, bangumiRoleDetailActivity, str);
                    bVar.f69262e.setVisibility(8);
                    bVar.f69259b.getGenericProperties().setOverlayImage((Drawable) null);
                    bVar.f69261d.setText(season.b());
                    bVar.f69260c.setText(season.f69283c);
                    int color = ContextCompat.getColor(bangumiRoleDetailActivity, R.color.white);
                    String str2 = season.h;
                    if (str2 != null && str2.length() != 0) {
                        bVar.f69262e.setText(season.h);
                        bVar.f69262e.setTextColor(color);
                        bVar.f69262e.setVisibility(0);
                        bVar.f69259b.getGenericProperties().setOverlayImage(AppCompatResources.getDrawable(bangumiRoleDetailActivity, 2131231049));
                    }
                    Kl0.a.a(bVar.f69263f, season.a(), true, false);
                    baseViewHolder.itemView.setTag(2131312914, season);
                    baseViewHolder.itemView.setTag(2131312952, Integer.valueOf(i7));
                    return;
                }
                return;
            }
            return;
        }
        final PersonInfoVo personInfoVo = roleDetailVo.getPersonInfoVo();
        final PersonRelateContentVo personRelateContentVo2 = roleDetailVo.getPersonRelateContentVo();
        String str3 = personInfoVo != null ? personInfoVo.f69266c : null;
        if (str3 == null || str3.length() == 0) {
            C0423a c0423a = (C0423a) baseViewHolder;
            c0423a.f69253b.setVisibility(8);
            c0423a.f69258g.setVisibility(8);
        } else {
            C0423a c0423a2 = (C0423a) baseViewHolder;
            c0423a2.f69253b.setVisibility(0);
            c0423a2.f69258g.setVisibility(0);
            ExpandableTextView expandableTextView = c0423a2.f69254c;
            ?? obj = new Object();
            obj.f69248a = str3;
            expandableTextView.setOriginText(obj);
            c0423a2.f69254c.setMaxRetractLines(3);
        }
        List<PersonInfoVo.Order> list2 = null;
        if (personInfoVo != null) {
            list2 = personInfoVo.f69270g;
        }
        if (list2 != null) {
            C0423a c0423a3 = (C0423a) baseViewHolder;
            c0423a3.f69257f.setText(personInfoVo.f69270g.get(this.h).f69271a);
            c0423a3.f69257f.setOnClickListener(new View.OnClickListener(personRelateContentVo2, this, personInfoVo, baseViewHolder) { // from class: vk0.i

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final PersonRelateContentVo f128281a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final com.bilibili.ogv.misc.roledetail.a f128282b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final PersonInfoVo f128283c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final BaseViewHolder f128284d;

                {
                    this.f128281a = personRelateContentVo2;
                    this.f128282b = this;
                    this.f128283c = personInfoVo;
                    this.f128284d = baseViewHolder;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    PersonRelateContentVo personRelateContentVo3 = this.f128281a;
                    com.bilibili.ogv.misc.roledetail.a aVar = this.f128282b;
                    PersonInfoVo personInfoVo2 = this.f128283c;
                    BaseViewHolder baseViewHolder2 = this.f128284d;
                    if ((personRelateContentVo3 != null ? personRelateContentVo3.f69280f : null) != null) {
                        List<PersonRelateContentVo.Season> list3 = personRelateContentVo3.f69280f;
                        if ((list3 != null ? Boolean.valueOf(list3.isEmpty()) : null).booleanValue()) {
                            return;
                        }
                        int i9 = aVar.h;
                        List<PersonInfoVo.Order> list4 = personInfoVo2.f69270g;
                        Integer numValueOf = null;
                        if (list4 != null) {
                            numValueOf = Integer.valueOf(list4.size());
                        }
                        if (i9 < numValueOf.intValue() - 1) {
                            aVar.h++;
                        } else {
                            aVar.h = 0;
                        }
                        ((a.C0423a) baseViewHolder2).f69257f.setText(personInfoVo2.f69270g.get(aVar.h).f69271a);
                        to.c cVar = aVar.f69252i;
                        if (cVar != null) {
                            int i10 = personInfoVo2.f69270g.get(aVar.h).f69272b;
                            BangumiRoleDetailActivity bangumiRoleDetailActivity2 = (BangumiRoleDetailActivity) cVar.f127574a;
                            bangumiRoleDetailActivity2.f69228Y = i10;
                            bangumiRoleDetailActivity2.f69226W = false;
                            bangumiRoleDetailActivity2.X6(false);
                        }
                    }
                }
            });
        }
        if (personRelateContentVo2 != null && (strB = personRelateContentVo2.b()) != null && strB.length() != 0) {
            ((C0423a) baseViewHolder).f69256e.setText(C8509b.a(personRelateContentVo2.f69277c, personRelateContentVo2.b(), " "));
        }
        boolean z7 = (personRelateContentVo2 == null || (list = personRelateContentVo2.f69280f) == null || !(list.isEmpty() ^ true)) ? false : true;
        View view2 = ((C0423a) baseViewHolder).f69255d;
        if (z7) {
            i8 = 0;
        }
        view2.setVisibility(i8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [tv.danmaku.bili.widget.section.holder.BaseViewHolder] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [com.bilibili.ogv.misc.roledetail.a$a] */
    /* JADX WARN: Type inference failed for: r8v4 */
    @NotNull
    public final BaseViewHolder onCreateHolder(@NotNull ViewGroup viewGroup, int i7) {
        ?? bVar;
        BangumiRoleDetailActivity bangumiRoleDetailActivity = this.f69250f;
        if (i7 == 101) {
            View viewInflate = LayoutInflater.from(bangumiRoleDetailActivity).inflate(2131502286, viewGroup, false);
            ?? baseViewHolder = new BaseViewHolder(viewInflate, this);
            baseViewHolder.f69253b = (LinearLayout) viewInflate.findViewById(2131305671);
            baseViewHolder.f69254c = (ExpandableTextView) viewInflate.findViewById(2131299344);
            baseViewHolder.f69255d = viewInflate.findViewById(2131310419);
            baseViewHolder.f69256e = (TextView) viewInflate.findViewById(2131315113);
            baseViewHolder.f69257f = (TextView) viewInflate.findViewById(2131314855);
            baseViewHolder.f69258g = viewInflate.findViewById(2131316292);
            bVar = baseViewHolder;
        } else {
            bVar = new b(LayoutInflater.from(bangumiRoleDetailActivity).inflate(2131502287, viewGroup, false), this);
        }
        return bVar;
    }
}
