package com.bilibili.music.podcast.collection.enums;

import android.view.ViewGroup;
import ki0.InterfaceC7767a;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import li0.InterfaceC7859b;
import oi0.C8219b;
import oi0.d;
import oi0.e;
import oi0.h;
import oi0.i;
import oi0.k;
import oi0.l;
import oi0.m;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/collection/enums/CollectionCardEnum.class */
public final class CollectionCardEnum {
    private static final EnumEntries $ENTRIES;
    private static final CollectionCardEnum[] $VALUES;

    @NotNull
    public static final a Companion;

    @NotNull
    private final Function2<ViewGroup, InterfaceC7767a<InterfaceC7859b>, d<InterfaceC7859b>> holderBuilder;
    public static final CollectionCardEnum UGC = new CollectionCardEnum("UGC", 0, AnonymousClass1.INSTANCE);
    public static final CollectionCardEnum SEASON = new CollectionCardEnum("SEASON", 1, AnonymousClass2.INSTANCE);
    public static final CollectionCardEnum UGC_SEASON = new CollectionCardEnum("UGC_SEASON", 2, AnonymousClass3.INSTANCE);
    public static final CollectionCardEnum OGV = new CollectionCardEnum("OGV", 3, AnonymousClass4.INSTANCE);
    public static final CollectionCardEnum AUDIO = new CollectionCardEnum("AUDIO", 4, AnonymousClass5.INSTANCE);
    public static final CollectionCardEnum FOLDER = new CollectionCardEnum("FOLDER", 5, AnonymousClass6.INSTANCE);
    public static final CollectionCardEnum UNKNOWN = new CollectionCardEnum("UNKNOWN", 6, AnonymousClass7.INSTANCE);

    /* JADX INFO: renamed from: com.bilibili.music.podcast.collection.enums.CollectionCardEnum$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/collection/enums/CollectionCardEnum$1.class */
    public static final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function2<ViewGroup, InterfaceC7767a<InterfaceC7859b>, k> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(2, k.class, "<init>", "<init>(Landroid/view/ViewGroup;Lcom/bilibili/music/podcast/collection/callback/CollectionCardClickListener;)V", 0);
        }

        public final k invoke(ViewGroup viewGroup, InterfaceC7767a<InterfaceC7859b> interfaceC7767a) {
            return new k(viewGroup, interfaceC7767a);
        }
    }

    /* JADX INFO: renamed from: com.bilibili.music.podcast.collection.enums.CollectionCardEnum$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/collection/enums/CollectionCardEnum$2.class */
    public static final /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements Function2<ViewGroup, InterfaceC7767a<InterfaceC7859b>, i> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(2, i.class, "<init>", "<init>(Landroid/view/ViewGroup;Lcom/bilibili/music/podcast/collection/callback/CollectionCardClickListener;)V", 0);
        }

        public final i invoke(ViewGroup viewGroup, InterfaceC7767a<InterfaceC7859b> interfaceC7767a) {
            return new i(viewGroup, interfaceC7767a);
        }
    }

    /* JADX INFO: renamed from: com.bilibili.music.podcast.collection.enums.CollectionCardEnum$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/collection/enums/CollectionCardEnum$3.class */
    public static final /* synthetic */ class AnonymousClass3 extends FunctionReferenceImpl implements Function2<ViewGroup, InterfaceC7767a<InterfaceC7859b>, l> {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        public AnonymousClass3() {
            super(2, l.class, "<init>", "<init>(Landroid/view/ViewGroup;Lcom/bilibili/music/podcast/collection/callback/CollectionCardClickListener;)V", 0);
        }

        public final l invoke(ViewGroup viewGroup, InterfaceC7767a<InterfaceC7859b> interfaceC7767a) {
            return new l(viewGroup, interfaceC7767a);
        }
    }

    /* JADX INFO: renamed from: com.bilibili.music.podcast.collection.enums.CollectionCardEnum$4, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/collection/enums/CollectionCardEnum$4.class */
    public static final /* synthetic */ class AnonymousClass4 extends FunctionReferenceImpl implements Function2<ViewGroup, InterfaceC7767a<InterfaceC7859b>, h> {
        public static final AnonymousClass4 INSTANCE = new AnonymousClass4();

        public AnonymousClass4() {
            super(2, h.class, "<init>", "<init>(Landroid/view/ViewGroup;Lcom/bilibili/music/podcast/collection/callback/CollectionCardClickListener;)V", 0);
        }

        public final h invoke(ViewGroup viewGroup, InterfaceC7767a<InterfaceC7859b> interfaceC7767a) {
            return new h(viewGroup, interfaceC7767a);
        }
    }

    /* JADX INFO: renamed from: com.bilibili.music.podcast.collection.enums.CollectionCardEnum$5, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/collection/enums/CollectionCardEnum$5.class */
    public static final /* synthetic */ class AnonymousClass5 extends FunctionReferenceImpl implements Function2<ViewGroup, InterfaceC7767a<InterfaceC7859b>, C8219b> {
        public static final AnonymousClass5 INSTANCE = new AnonymousClass5();

        public AnonymousClass5() {
            super(2, C8219b.class, "<init>", "<init>(Landroid/view/ViewGroup;Lcom/bilibili/music/podcast/collection/callback/CollectionCardClickListener;)V", 0);
        }

        public final C8219b invoke(ViewGroup viewGroup, InterfaceC7767a<InterfaceC7859b> interfaceC7767a) {
            return new C8219b(viewGroup, interfaceC7767a);
        }
    }

    /* JADX INFO: renamed from: com.bilibili.music.podcast.collection.enums.CollectionCardEnum$6, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/collection/enums/CollectionCardEnum$6.class */
    public static final /* synthetic */ class AnonymousClass6 extends FunctionReferenceImpl implements Function2<ViewGroup, InterfaceC7767a<InterfaceC7859b>, e> {
        public static final AnonymousClass6 INSTANCE = new AnonymousClass6();

        public AnonymousClass6() {
            super(2, e.class, "<init>", "<init>(Landroid/view/ViewGroup;Lcom/bilibili/music/podcast/collection/callback/CollectionCardClickListener;)V", 0);
        }

        public final e invoke(ViewGroup viewGroup, InterfaceC7767a<InterfaceC7859b> interfaceC7767a) {
            return new e(viewGroup, interfaceC7767a);
        }
    }

    /* JADX INFO: renamed from: com.bilibili.music.podcast.collection.enums.CollectionCardEnum$7, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/collection/enums/CollectionCardEnum$7.class */
    public static final /* synthetic */ class AnonymousClass7 extends FunctionReferenceImpl implements Function2<ViewGroup, InterfaceC7767a<InterfaceC7859b>, m> {
        public static final AnonymousClass7 INSTANCE = new AnonymousClass7();

        public AnonymousClass7() {
            super(2, m.class, "<init>", "<init>(Landroid/view/ViewGroup;Lcom/bilibili/music/podcast/collection/callback/CollectionCardClickListener;)V", 0);
        }

        public final m invoke(ViewGroup viewGroup, InterfaceC7767a<InterfaceC7859b> interfaceC7767a) {
            return new m(viewGroup, interfaceC7767a);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/collection/enums/CollectionCardEnum$a.class */
    public static final class a {
    }

    private static final /* synthetic */ CollectionCardEnum[] $values() {
        return new CollectionCardEnum[]{UGC, SEASON, UGC_SEASON, OGV, AUDIO, FOLDER, UNKNOWN};
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [com.bilibili.music.podcast.collection.enums.CollectionCardEnum$a, java.lang.Object] */
    static {
        CollectionCardEnum[] collectionCardEnumArr$values = $values();
        $VALUES = collectionCardEnumArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(collectionCardEnumArr$values);
        Companion = new Object();
    }

    private CollectionCardEnum(String str, int i7, Function2 function2) {
        this.holderBuilder = function2;
    }

    @NotNull
    public static EnumEntries<CollectionCardEnum> getEntries() {
        return $ENTRIES;
    }

    public static CollectionCardEnum valueOf(String str) {
        return (CollectionCardEnum) Enum.valueOf(CollectionCardEnum.class, str);
    }

    public static CollectionCardEnum[] values() {
        return (CollectionCardEnum[]) $VALUES.clone();
    }

    @NotNull
    public final Function2<ViewGroup, InterfaceC7767a<InterfaceC7859b>, d<InterfaceC7859b>> getHolderBuilder() {
        return this.holderBuilder;
    }
}
