package com.bilibili.search2.result.base;

import Ps0.C;
import Ps0.C2792m;
import Ps0.G;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.lib.moss.api.MossException;
import com.bilibili.search2.api.BaseSearchItem;
import com.bilibili.search2.api.SearchResultAll;
import com.bilibili.search2.api.VerticalSearchResult;
import com.bilibili.search2.main.data.SearchUserActManager;
import com.bilibili.search2.result.base.i;
import com.bilibili.teenagersmode.TeenagersMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/base/q.class */
@StabilityInferred(parameters = 1)
public abstract class q {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/base/q$a.class */
    @StabilityInferred(parameters = 1)
    public static abstract class a extends q {

        /* JADX INFO: renamed from: com.bilibili.search2.result.base.q$a$a, reason: collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/base/q$a$a.class */
        @StabilityInferred(parameters = 1)
        public static final class C0592a extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final C0592a f87574a = new a();

            @Override // com.bilibili.search2.result.base.q.a, com.bilibili.search2.result.base.q
            @NotNull
            public final SearchState b(@NotNull SearchState searchState) {
                return SearchState.copy$default(searchState, null, null, null, null, null, null, false, false, null, false, 0, null, null, null, null, null, null, null, false, 0, null, 0, false, null, false, null, false, false, 0, null, null, 1073741823, null);
            }

            public final boolean equals(@Nullable Object obj) {
                return this == obj || (obj instanceof C0592a);
            }

            public final int hashCode() {
                return 832159123;
            }

            @NotNull
            public final String toString() {
                return "CleanFoldedData";
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/base/q$a$b.class */
        @StabilityInferred(parameters = 1)
        public static final class b extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final b f87575a = new a();

            public final boolean equals(@Nullable Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return 1652127226;
            }

            @NotNull
            public final String toString() {
                return "ClearStateBeforeNet";
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/base/q$a$c.class */
        @StabilityInferred(parameters = 0)
        public static final class c extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public final n f87576a;

            public c(@NotNull n nVar) {
                this.f87576a = nVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0032  */
            @Override // com.bilibili.search2.result.base.q.a, com.bilibili.search2.result.base.q
            @org.jetbrains.annotations.NotNull
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final com.bilibili.search2.result.base.SearchState b(@org.jetbrains.annotations.NotNull com.bilibili.search2.result.base.SearchState r36) {
                /*
                    Method dump skipped, instruction units count: 231
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.result.base.q.a.c.b(com.bilibili.search2.result.base.SearchState):com.bilibili.search2.result.base.SearchState");
            }

            public final boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && Intrinsics.areEqual(this.f87576a, ((c) obj).f87576a);
            }

            public final int hashCode() {
                return this.f87576a.hashCode();
            }

            @NotNull
            public final String toString() {
                return "NotifyChange(params=" + this.f87576a + ")";
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/base/q$a$d.class */
        @StabilityInferred(parameters = 0)
        public static final class d extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public final BaseSearchItem f87577a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final int f87578b;

            public d(@NotNull BaseSearchItem baseSearchItem, int i7) {
                this.f87577a = baseSearchItem;
                this.f87578b = i7;
            }

            /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
            @Override // com.bilibili.search2.result.base.q.a, com.bilibili.search2.result.base.q
            @org.jetbrains.annotations.NotNull
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final com.bilibili.search2.result.base.SearchState b(@org.jetbrains.annotations.NotNull com.bilibili.search2.result.base.SearchState r36) {
                /*
                    r35 = this;
                    r0 = r36
                    java.util.List r0 = r0.getAllResultList()
                    r37 = r0
                    r0 = r37
                    if (r0 == 0) goto L1d
                    r0 = r37
                    java.util.Collection r0 = (java.util.Collection) r0
                    java.util.List r0 = kotlin.collections.CollectionsKt.toMutableList(r0)
                    r38 = r0
                    r0 = r38
                    r37 = r0
                    r0 = r38
                    if (r0 != 0) goto L1a
                    goto L1d
                L1a:
                    goto L28
                L1d:
                    java.util.ArrayList r0 = new java.util.ArrayList
                    r1 = r0
                    r1.<init>()
                    r37 = r0
                    goto L1a
                L28:
                    r0 = r35
                    com.bilibili.search2.api.BaseSearchItem r0 = r0.f87577a
                    r38 = r0
                    r0 = r37
                    r1 = r38
                    int r0 = r0.indexOf(r1)
                    if (r0 >= 0) goto L39
                    r0 = r36
                    return r0
                L39:
                    r0 = r37
                    r1 = r38
                    boolean r0 = r0.remove(r1)
                    r0 = r37
                    boolean r0 = r0.isEmpty()
                    if (r0 == 0) goto L7b
                    com.bilibili.search2.result.base.i$c r0 = new com.bilibili.search2.result.base.i$c
                    r1 = r0
                    r1.<init>()
                    r37 = r0
                    r0 = r36
                    r1 = 0
                    r2 = 0
                    r3 = 0
                    r4 = 0
                    r5 = 0
                    r6 = 0
                    r7 = 0
                    r8 = 0
                    java.lang.Boolean r9 = java.lang.Boolean.FALSE
                    r10 = 0
                    r11 = 0
                    r12 = 0
                    r13 = 0
                    r14 = 0
                    r15 = 0
                    r16 = r37
                    r17 = 0
                    r18 = 0
                    r19 = 0
                    r20 = 0
                    r21 = 0
                    r22 = 0
                    r23 = 0
                    r24 = 0
                    r25 = 0
                    r26 = 0
                    r27 = 0
                    r28 = 0
                    r29 = 0
                    r30 = 0
                    r31 = 0
                    r32 = 2147450494(0x7fff7e7e, float:NaN)
                    r33 = 0
                    com.bilibili.search2.result.base.SearchState r0 = com.bilibili.search2.result.base.SearchState.copy$default(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
                    return r0
                L7b:
                    r0 = r37
                    com.bilibili.search2.result.base.r.a(r0)
                    r0 = r36
                    r1 = r37
                    r2 = 0
                    r3 = 0
                    r4 = 0
                    r5 = 0
                    r6 = 0
                    r7 = 0
                    r8 = 0
                    r9 = 0
                    r10 = 0
                    r11 = 0
                    r12 = 0
                    r13 = 0
                    r14 = 0
                    r15 = 0
                    r16 = 0
                    r17 = 0
                    r18 = 0
                    r19 = 0
                    r20 = 0
                    r21 = 0
                    r22 = 0
                    r23 = 0
                    r24 = 0
                    r25 = 0
                    r26 = 0
                    r27 = 0
                    r28 = 1
                    r29 = 0
                    r30 = 0
                    r31 = 0
                    r32 = 2013265918(0x77fffffe, float:1.03845925E34)
                    r33 = 0
                    com.bilibili.search2.result.base.SearchState r0 = com.bilibili.search2.result.base.SearchState.copy$default(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.result.base.q.a.d.b(com.bilibili.search2.result.base.SearchState):com.bilibili.search2.result.base.SearchState");
            }

            public final boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return Intrinsics.areEqual(this.f87577a, dVar.f87577a) && this.f87578b == dVar.f87578b;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f87578b) + (this.f87577a.hashCode() * 31);
            }

            @NotNull
            public final String toString() {
                return "Remove(item=" + this.f87577a + ", position=" + this.f87578b + ")";
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/base/q$a$e.class */
        @StabilityInferred(parameters = 1)
        public static final class e extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final e f87579a = new a();

            public final boolean equals(@Nullable Object obj) {
                return this == obj || (obj instanceof e);
            }

            public final int hashCode() {
                return -2134357939;
            }

            @NotNull
            public final String toString() {
                return "ScrollToTop";
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/base/q$a$f.class */
        @StabilityInferred(parameters = 1)
        public static final class f extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final f f87580a = new a();

            public final boolean equals(@Nullable Object obj) {
                return this == obj || (obj instanceof f);
            }

            public final int hashCode() {
                return -937799988;
            }

            @NotNull
            public final String toString() {
                return "UpdateSortBar";
            }
        }

        @Override // com.bilibili.search2.result.base.q
        @NotNull
        public SearchState b(@NotNull SearchState searchState) {
            q.a("Event", searchState, searchState, this);
            return searchState;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/base/q$b.class */
    @StabilityInferred(parameters = 1)
    public static abstract class b extends q {

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/base/q$b$a.class */
        @StabilityInferred(parameters = 1)
        public static final class a extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final boolean f87581a = true;

            public final boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && this.f87581a == ((a) obj).f87581a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f87581a);
            }

            @NotNull
            public final String toString() {
                return androidx.appcompat.app.i.a(new StringBuilder("Loading(show="), this.f87581a, ")");
            }
        }

        /* JADX INFO: renamed from: com.bilibili.search2.result.base.q$b$b, reason: collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/base/q$b$b.class */
        @StabilityInferred(parameters = 0)
        public static final class C0593b extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public final SearchResultAll f87582a;

            public C0593b(@NotNull SearchResultAll searchResultAll) {
                this.f87582a = searchResultAll;
            }

            public final boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0593b) && Intrinsics.areEqual(this.f87582a, ((C0593b) obj).f87582a);
            }

            public final int hashCode() {
                return this.f87582a.hashCode();
            }

            @NotNull
            public final String toString() {
                return "OnlyShowNav(searchResultAll=" + this.f87582a + ")";
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/base/q$b$c.class */
        @StabilityInferred(parameters = 1)
        public static final class c extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final c f87583a = new q();
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/base/q$b$d.class */
        @StabilityInferred(parameters = 1)
        public static final class d extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @Nullable
            public final String f87584a = "please override effect flow fun";

            public final boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && Intrinsics.areEqual(this.f87584a, ((d) obj).f87584a);
            }

            public final int hashCode() {
                String str = this.f87584a;
                return str == null ? 0 : str.hashCode();
            }

            @NotNull
            public final String toString() {
                return C8770a.a(new StringBuilder("ShowError(error="), this.f87584a, ")");
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/base/q$b$e.class */
        @StabilityInferred(parameters = 1)
        public static final class e extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public final i f87585a;

            public e(@NotNull i iVar) {
                this.f87585a = iVar;
            }

            public final boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof e) && Intrinsics.areEqual(this.f87585a, ((e) obj).f87585a);
            }

            public final int hashCode() {
                return this.f87585a.hashCode();
            }

            @NotNull
            public final String toString() {
                return "ShowErrorState(errorState=" + this.f87585a + ")";
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/base/q$b$f.class */
        @StabilityInferred(parameters = 0)
        public static final class f extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public final SearchResultAll f87586a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @Nullable
            public final String f87587b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            @NotNull
            public final t f87588c;

            public f(@NotNull SearchResultAll searchResultAll, @Nullable String str, @NotNull t tVar) {
                this.f87586a = searchResultAll;
                this.f87587b = str;
                this.f87588c = tVar;
            }

            public final boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof f)) {
                    return false;
                }
                f fVar = (f) obj;
                return Intrinsics.areEqual(this.f87586a, fVar.f87586a) && Intrinsics.areEqual(this.f87587b, fVar.f87587b) && Intrinsics.areEqual(this.f87588c, fVar.f87588c);
            }

            public final int hashCode() {
                int iHashCode = this.f87586a.hashCode();
                String str = this.f87587b;
                return this.f87588c.hashCode() + (((iHashCode * 31) + (str == null ? 0 : str.hashCode())) * 31);
            }

            @NotNull
            public final String toString() {
                return "Success(searchResultAll=" + this.f87586a + ", query=" + this.f87587b + ", searchInitParams=" + this.f87588c + ")";
            }
        }

        @Override // com.bilibili.search2.result.base.q
        @NotNull
        public final SearchState b(@NotNull SearchState searchState) {
            SearchState searchStateB;
            boolean z6;
            K90.c cVar;
            if (this instanceof a) {
                searchStateB = SearchState.copy$default(searchState, null, null, null, null, null, null, false, ((a) this).f87581a, null, false, 0, null, null, null, null, null, null, null, false, 0, null, 0, false, null, false, null, false, false, 0, null, null, 2013151103, null);
            } else if (this instanceof c) {
                searchStateB = new SearchState(null, null, null, null, null, null, false, true, null, false, 0, null, null, null, null, null, null, null, false, 0, null, 0, false, null, false, null, TeenagersMode.getInstance().isEnable(), false, 0, null, null, 2080374655, null);
            } else if (this instanceof f) {
                f fVar = (f) this;
                SearchResultAll searchResultAll = fVar.f87586a;
                C2792m pageReplyInfo = searchResultAll.getPageReplyInfo();
                String str = pageReplyInfo != null ? pageReplyInfo.f19220a : null;
                List<BaseSearchItem> list = searchResultAll.items;
                if (list == null || (cVar = (BaseSearchItem) list.get(0)) == null) {
                    z6 = false;
                } else {
                    G g7 = cVar instanceof G ? (G) cVar : null;
                    z6 = g7 != null && g7.drawBgColor();
                }
                com.bilibili.search2.main.data.c cVar2 = new com.bilibili.search2.main.data.c(fVar.f87587b, searchResultAll.getResponseTime(), searchResultAll.qvId);
                SearchUserActManager.a(new com.bilibili.search2.main.data.a(cVar2, null));
                searchResultAll.setUserActQuery(cVar2);
                if (list != null) {
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        ((BaseSearchItem) it.next()).setUserActQuery(cVar2);
                    }
                }
                List<BaseSearchItem> list2 = null;
                if (list != null) {
                    r.a(list);
                    list2 = list;
                }
                ArrayList<SearchResultAll.NavInfo> arrayList = searchResultAll.nav;
                C searchFilter = searchResultAll.getSearchFilter();
                List<String> list3 = searchResultAll.extraWords;
                String str2 = searchResultAll.trackId;
                boolean z7 = str != null && str.length() == 0;
                t tVar = fVar.f87588c;
                searchStateB = SearchState.copy$default(searchState, list2, searchResultAll, cVar2, null, arrayList, list3, false, false, Boolean.FALSE, z7, 1, fVar.f87587b, str, str2, null, null, null, null, z6, tVar.f87616g, tVar.f87618j, 0, searchResultAll.enableRefresh(), null, false, null, false, false, searchResultAll.getAlienationCardCount(), searchFilter, searchResultAll.getFoldedItems(), 126025800, null);
            } else if (this instanceof C0593b) {
                SearchResultAll searchResultAll2 = ((C0593b) this).f87582a;
                searchStateB = SearchState.copy$default(searchState, null, searchResultAll2, null, null, searchResultAll2.nav, null, false, false, null, false, 0, null, null, null, null, null, null, null, false, 0, null, 0, false, null, false, null, false, false, 0, null, null, 2147482605, null);
            } else if (this instanceof e) {
                i iVar = ((e) this).f87585a;
                searchStateB = iVar instanceof i.c ? SearchState.copy$default(searchState, null, null, null, null, null, null, false, false, Boolean.FALSE, false, 0, null, null, null, (i.c) iVar, null, null, null, false, 0, null, 0, false, null, false, null, false, false, 0, null, null, 2147466862, null) : SearchState.copy$default(searchState, null, null, null, null, null, null, false, false, Boolean.FALSE, false, 0, null, null, null, iVar, null, null, null, false, 0, null, 0, false, null, false, null, false, false, 0, null, null, 2147466879, null);
            } else {
                searchStateB = super.b(searchState);
            }
            q.a("init", searchStateB, searchState, this);
            return searchStateB;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/base/q$c.class */
    @StabilityInferred(parameters = 1)
    public static abstract class c extends q {

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/base/q$c$a.class */
        @StabilityInferred(parameters = 0)
        public static final class a extends c {
            public final boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                ((a) obj).getClass();
                return Intrinsics.areEqual((Object) null, (Object) null);
            }

            public final int hashCode() {
                throw null;
            }

            @NotNull
            public final String toString() {
                return "Insert(params=" + ((Object) null) + ")";
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/base/q$c$b.class */
        @StabilityInferred(parameters = 0)
        public static final class b extends c {
            public final boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                ((b) obj).getClass();
                return Intrinsics.areEqual((Object) null, (Object) null);
            }

            public final int hashCode() {
                throw null;
            }

            @NotNull
            public final String toString() {
                return "ReplaceIndex(params=" + ((Object) null) + ")";
            }
        }

        /* JADX INFO: renamed from: com.bilibili.search2.result.base.q$c$c, reason: collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/base/q$c$c.class */
        @StabilityInferred(parameters = 0)
        public static final class C0594c extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public final l f87589a;

            public C0594c(@NotNull l lVar) {
                this.f87589a = lVar;
            }

            public final boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0594c) && Intrinsics.areEqual(this.f87589a, ((C0594c) obj).f87589a);
            }

            public final int hashCode() {
                return this.f87589a.hashCode();
            }

            @NotNull
            public final String toString() {
                return "ReplaceSameGoto(params=" + this.f87589a + ")";
            }
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0057  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x01db  */
        @Override // com.bilibili.search2.result.base.q
        @org.jetbrains.annotations.NotNull
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final com.bilibili.search2.result.base.SearchState b(@org.jetbrains.annotations.NotNull com.bilibili.search2.result.base.SearchState r36) throws kotlin.NoWhenBranchMatchedException {
            /*
                Method dump skipped, instruction units count: 504
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.result.base.q.c.b(com.bilibili.search2.result.base.SearchState):com.bilibili.search2.result.base.SearchState");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/base/q$d.class */
    @StabilityInferred(parameters = 1)
    public static abstract class d extends q {

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/base/q$d$a.class */
        @StabilityInferred(parameters = 0)
        public static final class a extends d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @Nullable
            public final Exception f87590a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @Nullable
            public final String f87591b;

            public a() {
                this(null, 3);
            }

            public a(String str, int i7) {
                str = (i7 & 2) != 0 ? null : str;
                this.f87590a = null;
                this.f87591b = str;
            }

            public final boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return Intrinsics.areEqual(this.f87590a, aVar.f87590a) && Intrinsics.areEqual(this.f87591b, aVar.f87591b);
            }

            public final int hashCode() {
                Exception exc = this.f87590a;
                int iHashCode = 0;
                int iHashCode2 = exc == null ? 0 : exc.hashCode();
                String str = this.f87591b;
                if (str != null) {
                    iHashCode = str.hashCode();
                }
                return (iHashCode2 * 31) + iHashCode;
            }

            @NotNull
            public final String toString() {
                return "Fail(exception=" + this.f87590a + ", error=" + this.f87591b + ")";
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/base/q$d$b.class */
        @StabilityInferred(parameters = 1)
        public static final class b extends d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final boolean f87592a = true;

            public final boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && this.f87592a == ((b) obj).f87592a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f87592a);
            }

            @NotNull
            public final String toString() {
                return androidx.appcompat.app.i.a(new StringBuilder("Loading(show="), this.f87592a, ")");
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/base/q$d$c.class */
        @StabilityInferred(parameters = 0)
        public static final class c extends d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public final SearchResultAll f87593a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @Nullable
            public final String f87594b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            @NotNull
            public final v f87595c;

            public c(@NotNull SearchResultAll searchResultAll, @Nullable String str, @NotNull v vVar) {
                this.f87593a = searchResultAll;
                this.f87594b = str;
                this.f87595c = vVar;
            }

            public final boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return Intrinsics.areEqual(this.f87593a, cVar.f87593a) && Intrinsics.areEqual(this.f87594b, cVar.f87594b) && Intrinsics.areEqual(this.f87595c, cVar.f87595c);
            }

            public final int hashCode() {
                int iHashCode = this.f87593a.hashCode();
                String str = this.f87594b;
                return this.f87595c.hashCode() + (((iHashCode * 31) + (str == null ? 0 : str.hashCode())) * 31);
            }

            @NotNull
            public final String toString() {
                return "MoreSuccess(searchResultAll=" + this.f87593a + ", query=" + this.f87594b + ", searchMoreParams=" + this.f87595c + ")";
            }
        }

        /* JADX INFO: renamed from: com.bilibili.search2.result.base.q$d$d, reason: collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/base/q$d$d.class */
        @StabilityInferred(parameters = 1)
        public static final class C0595d extends d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final boolean f87596a;

            public C0595d(boolean z6) {
                this.f87596a = z6;
            }

            public final boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0595d) && this.f87596a == ((C0595d) obj).f87596a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f87596a);
            }

            @NotNull
            public final String toString() {
                return androidx.appcompat.app.i.a(new StringBuilder("Reset(isFilter="), this.f87596a, ")");
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/base/q$d$e.class */
        @StabilityInferred(parameters = 0)
        public static final class e extends d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @Nullable
            public final Exception f87597a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @Nullable
            public final String f87598b;

            public e() {
                this(null, null, 3);
            }

            public e(MossException mossException, String str, int i7) {
                mossException = (i7 & 1) != 0 ? null : mossException;
                str = (i7 & 2) != 0 ? null : str;
                this.f87597a = mossException;
                this.f87598b = str;
            }

            public final boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof e)) {
                    return false;
                }
                e eVar = (e) obj;
                return Intrinsics.areEqual(this.f87597a, eVar.f87597a) && Intrinsics.areEqual(this.f87598b, eVar.f87598b);
            }

            public final int hashCode() {
                Exception exc = this.f87597a;
                int iHashCode = 0;
                int iHashCode2 = exc == null ? 0 : exc.hashCode();
                String str = this.f87598b;
                if (str != null) {
                    iHashCode = str.hashCode();
                }
                return (iHashCode2 * 31) + iHashCode;
            }

            @NotNull
            public final String toString() {
                return "ShowError(exception=" + this.f87597a + ", error=" + this.f87598b + ")";
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x00fb  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0109  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x012c  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x015b  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x018f  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x0199  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x01a6  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x01f4  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x0201  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x020b  */
        /* JADX WARN: Removed duplicated region for block: B:68:0x0218  */
        /* JADX WARN: Removed duplicated region for block: B:70:0x0221  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x0232  */
        /* JADX WARN: Removed duplicated region for block: B:79:0x0255  */
        @Override // com.bilibili.search2.result.base.q
        @org.jetbrains.annotations.NotNull
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final com.bilibili.search2.result.base.SearchState b(@org.jetbrains.annotations.NotNull com.bilibili.search2.result.base.SearchState r37) {
            /*
                Method dump skipped, instruction units count: 745
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.result.base.q.d.b(com.bilibili.search2.result.base.SearchState):com.bilibili.search2.result.base.SearchState");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/base/q$e.class */
    @StabilityInferred(parameters = 1)
    public static final class e extends q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final i f87599a;

        public e(@NotNull i iVar) {
            this.f87599a = iVar;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && Intrinsics.areEqual(this.f87599a, ((e) obj).f87599a);
        }

        public final int hashCode() {
            return this.f87599a.hashCode();
        }

        @NotNull
        public final String toString() {
            return "ShowErrorState(errorState=" + this.f87599a + ")";
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/base/q$f.class */
    @StabilityInferred(parameters = 1)
    public static final class f extends q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final k f87600a;

        public f(@NotNull k kVar) {
            this.f87600a = kVar;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && Intrinsics.areEqual(this.f87600a, ((f) obj).f87600a);
        }

        public final int hashCode() {
            k kVar = this.f87600a;
            kVar.getClass();
            return System.identityHashCode(kVar);
        }

        @NotNull
        public final String toString() {
            return "ShowFooterState(footerState=" + this.f87600a + ")";
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/base/q$g.class */
    @StabilityInferred(parameters = 1)
    public static abstract class g extends q {

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/base/q$g$a.class */
        @StabilityInferred(parameters = 1)
        public static final class a extends g {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final boolean f87601a = true;

            public final boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && this.f87601a == ((a) obj).f87601a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f87601a);
            }

            @NotNull
            public final String toString() {
                return androidx.appcompat.app.i.a(new StringBuilder("Loading(show="), this.f87601a, ")");
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/base/q$g$b.class */
        @StabilityInferred(parameters = 1)
        public static final class b extends g {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final boolean f87602a;

            public b() {
                this(false);
            }

            public b(boolean z6) {
                this.f87602a = z6;
            }

            public final boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && this.f87602a == ((b) obj).f87602a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f87602a);
            }

            @NotNull
            public final String toString() {
                return androidx.appcompat.app.i.a(new StringBuilder("Reset(saveExtra="), this.f87602a, ")");
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/base/q$g$c.class */
        @StabilityInferred(parameters = 0)
        public static final class c extends g {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @Nullable
            public final Exception f87603a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @Nullable
            public final String f87604b;

            public c() {
                this(null, null, 3);
            }

            public c(MossException mossException, String str, int i7) {
                mossException = (i7 & 1) != 0 ? null : mossException;
                str = (i7 & 2) != 0 ? null : str;
                this.f87603a = mossException;
                this.f87604b = str;
            }

            public final boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return Intrinsics.areEqual(this.f87603a, cVar.f87603a) && Intrinsics.areEqual(this.f87604b, cVar.f87604b);
            }

            public final int hashCode() {
                Exception exc = this.f87603a;
                int iHashCode = 0;
                int iHashCode2 = exc == null ? 0 : exc.hashCode();
                String str = this.f87604b;
                if (str != null) {
                    iHashCode = str.hashCode();
                }
                return (iHashCode2 * 31) + iHashCode;
            }

            @NotNull
            public final String toString() {
                return "ShowError(exception=" + this.f87603a + ", error=" + this.f87604b + ")";
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/base/q$g$d.class */
        @StabilityInferred(parameters = 0)
        public static final class d extends g {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public final VerticalSearchResult<?> f87605a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            public final x f87606b;

            public d(@NotNull VerticalSearchResult<?> verticalSearchResult, @NotNull x xVar) {
                this.f87605a = verticalSearchResult;
                this.f87606b = xVar;
            }

            public final boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return Intrinsics.areEqual(this.f87605a, dVar.f87605a) && Intrinsics.areEqual(this.f87606b, dVar.f87606b);
            }

            public final int hashCode() {
                return this.f87606b.hashCode() + (this.f87605a.hashCode() * 31);
            }

            @NotNull
            public final String toString() {
                return "VerticalSuccess(searchResult=" + this.f87605a + ", searchParams=" + this.f87606b + ")";
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:100:0x02dc  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x00dd  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x01da  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x01eb  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x01f5  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x0236  */
        /* JADX WARN: Removed duplicated region for block: B:74:0x023f  */
        /* JADX WARN: Removed duplicated region for block: B:77:0x024f  */
        /* JADX WARN: Removed duplicated region for block: B:81:0x0268  */
        /* JADX WARN: Removed duplicated region for block: B:87:0x028b  */
        /* JADX WARN: Removed duplicated region for block: B:90:0x02a4  */
        /* JADX WARN: Removed duplicated region for block: B:96:0x02c6  */
        /* JADX WARN: Removed duplicated region for block: B:99:0x02d2  */
        @Override // com.bilibili.search2.result.base.q
        @org.jetbrains.annotations.NotNull
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final com.bilibili.search2.result.base.SearchState b(@org.jetbrains.annotations.NotNull com.bilibili.search2.result.base.SearchState r37) {
            /*
                Method dump skipped, instruction units count: 815
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.result.base.q.g.b(com.bilibili.search2.result.base.SearchState):com.bilibili.search2.result.base.SearchState");
        }
    }

    public static void a(@NotNull String str, @NotNull SearchState searchState, @NotNull SearchState searchState2, @NotNull q qVar) {
        BLog.d("SearchEffect", str + " reduce partialChange: " + qVar + " oldState: " + searchState2 + " result: " + searchState);
    }

    @NotNull
    public SearchState b(@NotNull SearchState searchState) {
        if (this instanceof e) {
            i iVar = ((e) this).f87599a;
            if (iVar instanceof i.c) {
                searchState = SearchState.copy$default(searchState, null, null, null, null, null, null, false, false, Boolean.FALSE, false, 0, null, null, null, null, (i.c) iVar, null, null, false, 0, null, 0, false, null, false, null, false, false, 0, null, null, 2147450494, null);
            } else {
                searchState = SearchState.copy$default(searchState, null, null, null, null, null, null, false, false, Boolean.FALSE, false, 0, null, null, null, null, iVar, null, null, false, 0, null, 0, false, null, false, null, false, false, 0, null, null, 2147450495, null);
            }
        } else if (this instanceof f) {
            searchState = SearchState.copy$default(searchState, null, null, null, null, null, null, false, false, Boolean.FALSE, false, 0, null, null, null, null, null, ((f) this).f87600a, null, false, 0, null, 0, false, null, false, null, false, false, 0, null, null, 2147417727, null);
        }
        return searchState;
    }
}
