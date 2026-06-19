package com.bilibili.search2.result.user;

import Bl.e0;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.search2.api.BaseSearchItem;
import com.bilibili.search2.result.all.C6053g;
import com.bilibili.search2.result.base.w;
import dt0.AbstractC6839b;
import dt0.AbstractC6843f;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.jetbrains.annotations.NotNull;
import xt0.C9006a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/user/SearchResultUserAdapter.class */
@StabilityInferred(parameters = 0)
public final class SearchResultUserAdapter extends w<AbstractC6843f<BaseSearchItem>> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final SearchResultUserFragment f88519e;

    /* JADX INFO: renamed from: com.bilibili.search2.result.user.SearchResultUserAdapter$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/user/SearchResultUserAdapter$1.class */
    public static final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function1<Boolean, Unit> {
        public AnonymousClass1(Object obj) {
            super(1, obj, SearchResultUserFragment.class, "loadData", "loadData(Z)V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke(((Boolean) obj).booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z6) {
            ((SearchResultUserFragment) ((CallableReference) this).receiver).loadData(z6);
        }
    }

    public SearchResultUserAdapter(@NotNull SearchResultUserFragment searchResultUserFragment) {
        super(new AnonymousClass1(searchResultUserFragment));
        this.f88519e = searchResultUserFragment;
    }

    @Override // com.bilibili.search2.result.all.AbstractC6048b
    public final AbstractC6839b P(int i7, ViewGroup viewGroup) {
        AbstractC6839b abstractC6839bA;
        if (i7 == -1793498294) {
            abstractC6839bA = new C9006a(e0.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false));
        } else if (i7 == -1406328437) {
            int i8 = j.f88559o;
            abstractC6839bA = new j(p.a(viewGroup, 2131494438, viewGroup, false), this.f88519e);
        } else {
            int i9 = C6053g.f87282b;
            abstractC6839bA = C6053g.a.a(viewGroup);
        }
        return abstractC6839bA;
    }

    @Override // com.bilibili.search2.result.base.w
    @NotNull
    public final Set<Integer> U() {
        return SetsKt.setOf(-1793498294);
    }
}
