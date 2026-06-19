package com.bilibili.playerbizcommonv2.widget.setting;

import androidx.compose.runtime.Stable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.widget.setting.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/setting/b.class */
@Stable
public final class C5830b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f83190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f83191b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f83192c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final DescriptionArrangementType f83193d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Function1<Integer, Unit> f83194e;

    /* JADX WARN: Multi-variable type inference failed */
    public C5830b(int i7, @NotNull String str, @NotNull String str2, @NotNull DescriptionArrangementType descriptionArrangementType, @NotNull Function1<? super Integer, Unit> function1) {
        this.f83190a = i7;
        this.f83191b = str;
        this.f83192c = str2;
        this.f83193d = descriptionArrangementType;
        this.f83194e = function1;
    }

    public /* synthetic */ C5830b(int i7, String str, Function1 function1) {
        this(i7, str, "", DescriptionArrangementType.Horizontal, function1);
    }
}
