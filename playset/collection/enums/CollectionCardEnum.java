package com.bilibili.playset.collection.enums;

import android.view.ViewGroup;
import bs0.InterfaceC5150a;
import cs0.InterfaceC6755a;
import ds0.AbstractC6837d;
import ds0.C6835b;
import ds0.e;
import ds0.f;
import ds0.h;
import ds0.i;
import ds0.k;
import ds0.l;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/collection/enums/CollectionCardEnum.class */
public final class CollectionCardEnum {
    private static final EnumEntries $ENTRIES;
    private static final CollectionCardEnum[] $VALUES;

    @NotNull
    public static final a Companion;

    @NotNull
    private final Function2<ViewGroup, InterfaceC5150a<InterfaceC6755a>, AbstractC6837d<InterfaceC6755a>> holderBuilder;
    public static final CollectionCardEnum UGC = new CollectionCardEnum("UGC", 0, AnonymousClass1.INSTANCE);
    public static final CollectionCardEnum SEASON = new CollectionCardEnum("SEASON", 1, AnonymousClass2.INSTANCE);
    public static final CollectionCardEnum PAY_SEASON = new CollectionCardEnum("PAY_SEASON", 2, AnonymousClass3.INSTANCE);
    public static final CollectionCardEnum UGC_SEASON = new CollectionCardEnum("UGC_SEASON", 3, AnonymousClass4.INSTANCE);
    public static final CollectionCardEnum OGV = new CollectionCardEnum("OGV", 4, AnonymousClass5.INSTANCE);
    public static final CollectionCardEnum AUDIO = new CollectionCardEnum("AUDIO", 5, AnonymousClass6.INSTANCE);
    public static final CollectionCardEnum FOLDER = new CollectionCardEnum("FOLDER", 6, AnonymousClass7.INSTANCE);
    public static final CollectionCardEnum UNKNOWN = new CollectionCardEnum("UNKNOWN", 7, AnonymousClass8.INSTANCE);

    /* JADX INFO: renamed from: com.bilibili.playset.collection.enums.CollectionCardEnum$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/collection/enums/CollectionCardEnum$1.class */
    public static final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function2<ViewGroup, InterfaceC5150a<InterfaceC6755a>, i> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(2, i.class, "<init>", "<init>(Landroid/view/ViewGroup;Lcom/bilibili/playset/collection/callback/CollectionCardClickListener;)V", 0);
        }

        public final i invoke(ViewGroup viewGroup, InterfaceC5150a<InterfaceC6755a> interfaceC5150a) {
            return new i(viewGroup, interfaceC5150a);
        }
    }

    /* JADX INFO: renamed from: com.bilibili.playset.collection.enums.CollectionCardEnum$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/collection/enums/CollectionCardEnum$2.class */
    public static final /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements Function2<ViewGroup, InterfaceC5150a<InterfaceC6755a>, h> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(2, h.class, "<init>", "<init>(Landroid/view/ViewGroup;Lcom/bilibili/playset/collection/callback/CollectionCardClickListener;)V", 0);
        }

        public final h invoke(ViewGroup viewGroup, InterfaceC5150a<InterfaceC6755a> interfaceC5150a) {
            return new h(viewGroup, interfaceC5150a);
        }
    }

    /* JADX INFO: renamed from: com.bilibili.playset.collection.enums.CollectionCardEnum$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/collection/enums/CollectionCardEnum$3.class */
    public static final /* synthetic */ class AnonymousClass3 extends FunctionReferenceImpl implements Function2<ViewGroup, InterfaceC5150a<InterfaceC6755a>, h> {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        public AnonymousClass3() {
            super(2, h.class, "<init>", "<init>(Landroid/view/ViewGroup;Lcom/bilibili/playset/collection/callback/CollectionCardClickListener;)V", 0);
        }

        public final h invoke(ViewGroup viewGroup, InterfaceC5150a<InterfaceC6755a> interfaceC5150a) {
            return new h(viewGroup, interfaceC5150a);
        }
    }

    /* JADX INFO: renamed from: com.bilibili.playset.collection.enums.CollectionCardEnum$4, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/collection/enums/CollectionCardEnum$4.class */
    public static final /* synthetic */ class AnonymousClass4 extends FunctionReferenceImpl implements Function2<ViewGroup, InterfaceC5150a<InterfaceC6755a>, k> {
        public static final AnonymousClass4 INSTANCE = new AnonymousClass4();

        public AnonymousClass4() {
            super(2, k.class, "<init>", "<init>(Landroid/view/ViewGroup;Lcom/bilibili/playset/collection/callback/CollectionCardClickListener;)V", 0);
        }

        public final k invoke(ViewGroup viewGroup, InterfaceC5150a<InterfaceC6755a> interfaceC5150a) {
            return new k(viewGroup, interfaceC5150a);
        }
    }

    /* JADX INFO: renamed from: com.bilibili.playset.collection.enums.CollectionCardEnum$5, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/collection/enums/CollectionCardEnum$5.class */
    public static final /* synthetic */ class AnonymousClass5 extends FunctionReferenceImpl implements Function2<ViewGroup, InterfaceC5150a<InterfaceC6755a>, f> {
        public static final AnonymousClass5 INSTANCE = new AnonymousClass5();

        public AnonymousClass5() {
            super(2, f.class, "<init>", "<init>(Landroid/view/ViewGroup;Lcom/bilibili/playset/collection/callback/CollectionCardClickListener;)V", 0);
        }

        public final f invoke(ViewGroup viewGroup, InterfaceC5150a<InterfaceC6755a> interfaceC5150a) {
            return new f(viewGroup, interfaceC5150a);
        }
    }

    /* JADX INFO: renamed from: com.bilibili.playset.collection.enums.CollectionCardEnum$6, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/collection/enums/CollectionCardEnum$6.class */
    public static final /* synthetic */ class AnonymousClass6 extends FunctionReferenceImpl implements Function2<ViewGroup, InterfaceC5150a<InterfaceC6755a>, C6835b> {
        public static final AnonymousClass6 INSTANCE = new AnonymousClass6();

        public AnonymousClass6() {
            super(2, C6835b.class, "<init>", "<init>(Landroid/view/ViewGroup;Lcom/bilibili/playset/collection/callback/CollectionCardClickListener;)V", 0);
        }

        public final C6835b invoke(ViewGroup viewGroup, InterfaceC5150a<InterfaceC6755a> interfaceC5150a) {
            return new C6835b(viewGroup, interfaceC5150a);
        }
    }

    /* JADX INFO: renamed from: com.bilibili.playset.collection.enums.CollectionCardEnum$7, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/collection/enums/CollectionCardEnum$7.class */
    public static final /* synthetic */ class AnonymousClass7 extends FunctionReferenceImpl implements Function2<ViewGroup, InterfaceC5150a<InterfaceC6755a>, e> {
        public static final AnonymousClass7 INSTANCE = new AnonymousClass7();

        public AnonymousClass7() {
            super(2, e.class, "<init>", "<init>(Landroid/view/ViewGroup;Lcom/bilibili/playset/collection/callback/CollectionCardClickListener;)V", 0);
        }

        public final e invoke(ViewGroup viewGroup, InterfaceC5150a<InterfaceC6755a> interfaceC5150a) {
            return new e(viewGroup, interfaceC5150a);
        }
    }

    /* JADX INFO: renamed from: com.bilibili.playset.collection.enums.CollectionCardEnum$8, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/collection/enums/CollectionCardEnum$8.class */
    public static final /* synthetic */ class AnonymousClass8 extends FunctionReferenceImpl implements Function2<ViewGroup, InterfaceC5150a<InterfaceC6755a>, l> {
        public static final AnonymousClass8 INSTANCE = new AnonymousClass8();

        public AnonymousClass8() {
            super(2, l.class, "<init>", "<init>(Landroid/view/ViewGroup;Lcom/bilibili/playset/collection/callback/CollectionCardClickListener;)V", 0);
        }

        public final l invoke(ViewGroup viewGroup, InterfaceC5150a<InterfaceC6755a> interfaceC5150a) {
            return new l(viewGroup, interfaceC5150a);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/collection/enums/CollectionCardEnum$a.class */
    public static final class a {

        /* JADX INFO: renamed from: com.bilibili.playset.collection.enums.CollectionCardEnum$a$a, reason: collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/collection/enums/CollectionCardEnum$a$a.class */
        public static final /* synthetic */ class C0564a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final int[] f84224a;

            static {
                int[] iArr = new int[CollectionTypeEnum.values().length];
                try {
                    iArr[CollectionTypeEnum.UGC.ordinal()] = 1;
                } catch (NoSuchFieldError e7) {
                }
                try {
                    iArr[CollectionTypeEnum.SEASON.ordinal()] = 2;
                } catch (NoSuchFieldError e8) {
                }
                try {
                    iArr[CollectionTypeEnum.PAY_SEASON.ordinal()] = 3;
                } catch (NoSuchFieldError e9) {
                }
                try {
                    iArr[CollectionTypeEnum.UGC_SEASON.ordinal()] = 4;
                } catch (NoSuchFieldError e10) {
                }
                try {
                    iArr[CollectionTypeEnum.OGV.ordinal()] = 5;
                } catch (NoSuchFieldError e11) {
                }
                try {
                    iArr[CollectionTypeEnum.AUDIO.ordinal()] = 6;
                } catch (NoSuchFieldError e12) {
                }
                try {
                    iArr[CollectionTypeEnum.FOLDER.ordinal()] = 7;
                } catch (NoSuchFieldError e13) {
                }
                f84224a = iArr;
            }
        }
    }

    private static final /* synthetic */ CollectionCardEnum[] $values() {
        return new CollectionCardEnum[]{UGC, SEASON, PAY_SEASON, UGC_SEASON, OGV, AUDIO, FOLDER, UNKNOWN};
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.bilibili.playset.collection.enums.CollectionCardEnum$a, java.lang.Object] */
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
    public final Function2<ViewGroup, InterfaceC5150a<InterfaceC6755a>, AbstractC6837d<InterfaceC6755a>> getHolderBuilder() {
        return this.holderBuilder;
    }
}
