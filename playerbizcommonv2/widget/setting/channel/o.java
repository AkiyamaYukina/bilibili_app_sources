package com.bilibili.playerbizcommonv2.widget.setting.channel;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.bilibili.playerbizcommonv2.widget.setting.channel.t;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/setting/channel/o.class */
@StabilityInferred(parameters = 0)
public final class o extends com.bilibili.app.gemini.ui.m<Dr0.r> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final t.b f83260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final a f83261b = new a();

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/setting/channel/o$a.class */
    public static final class a extends RecyclerView.Adapter<b> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f83263b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f83264c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f83265d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f83267f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f83268g;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final List<C0554a> f83262a = new ArrayList();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public Function1<? super Integer, Unit> f83266e = new com.bilibili.biligame.steam.c(1);

        /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.widget.setting.channel.o$a$a, reason: collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/setting/channel/o$a$a.class */
        @StabilityInferred(parameters = 1)
        public static final class C0554a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public final String f83269a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final boolean f83270b;

            public C0554a(@NotNull String str, boolean z6) {
                this.f83269a = str;
                this.f83270b = z6;
            }

            public final boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0554a)) {
                    return false;
                }
                C0554a c0554a = (C0554a) obj;
                return Intrinsics.areEqual(this.f83269a, c0554a.f83269a) && this.f83270b == c0554a.f83270b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f83270b) + (this.f83269a.hashCode() * 31);
            }

            @NotNull
            public final String toString() {
                StringBuilder sb = new StringBuilder("SelectItem(title=");
                sb.append(this.f83269a);
                sb.append(", select=");
                return androidx.appcompat.app.i.a(sb, this.f83270b, ")");
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/setting/channel/o$a$b.class */
        public static final class b extends RecyclerView.ViewHolder {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public final AppCompatTextView f83271a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            public final View f83272b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            @Nullable
            public final Typeface f83273c;

            public b(@NotNull Dr0.s sVar) {
                super(sVar.f3141a);
                AppCompatTextView appCompatTextView = sVar.f3143c;
                this.f83271a = appCompatTextView;
                this.f83272b = sVar.f3142b;
                this.f83273c = appCompatTextView.getTypeface();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            return ((ArrayList) this.f83262a).size();
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x00bc  */
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
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r8, int r9) {
            /*
                Method dump skipped, instruction units count: 230
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommonv2.widget.setting.channel.o.a.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i7) {
            return new b(Dr0.s.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false));
        }
    }

    public o(@NotNull t.b bVar) {
        this.f83260a = bVar;
    }

    public final Object a(ViewBinding viewBinding, Continuation continuation) {
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new VideoSettingMultilineSelectComponent$bind$2((Dr0.r) viewBinding, this, null), continuation);
        if (objCoroutineScope != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            objCoroutineScope = Unit.INSTANCE;
        }
        return objCoroutineScope;
    }

    public final ViewBinding b(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return Dr0.r.inflate(LayoutInflater.from(context), viewGroup, false);
    }
}
