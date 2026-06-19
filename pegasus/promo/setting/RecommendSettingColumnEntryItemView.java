package com.bilibili.pegasus.promo.setting;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import com.bilibili.app.screen.adjust.utils.ScreenAdjustUtilsKt;
import com.bilibili.magicasakura.widgets.TintLinearLayout;
import gl.K;
import kntr.base.android.legacy.context.ContextUtilKt;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/promo/setting/RecommendSettingColumnEntryItemView.class */
@StabilityInferred(parameters = 0)
public final class RecommendSettingColumnEntryItemView extends TintLinearLayout {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f78543d = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final K f78544c;

    @JvmOverloads
    public RecommendSettingColumnEntryItemView(@NotNull Context context) {
        this(context, null, 6, 0);
    }

    @JvmOverloads
    public RecommendSettingColumnEntryItemView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [android.view.View$OnClickListener, java.lang.Object] */
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
    public RecommendSettingColumnEntryItemView(Context context, AttributeSet attributeSet, int i7, int i8) {
        super(context, (i7 & 2) != 0 ? null : attributeSet, 0);
        K kBind = K.bind(LayoutInflater.from(context).inflate(2131496290, (ViewGroup) this, true));
        this.f78544c = kBind;
        kBind.b.setOnClickListener(new Object());
        RecommendColumnSwitchData recommendColumnSwitchDataA = k.a();
        if (recommendColumnSwitchDataA != null) {
            kBind.d.setText(recommendColumnSwitchDataA.getTitle());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        FragmentActivity fragmentActivityFindFragmentActivityOrNull = ContextUtilKt.findFragmentActivityOrNull(getContext());
        if (fragmentActivityFindFragmentActivityOrNull != null) {
            ScreenAdjustUtilsKt.collectWindowSize$default(fragmentActivityFindFragmentActivityOrNull, false, new SD0.j(this, 1), 1, (Object) null);
        }
    }
}
