package com.bilibili.ogv.operation3.module.operablecard;

import F3.C1698b5;
import F3.C1706c5;
import F3.C1714d5;
import I.E;
import J2.g;
import androidx.compose.animation.core.I;
import androidx.compose.animation.n;
import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import com.bilibili.ogv.operation3.module.followable.l;
import com.bilibili.ogv.operation3.module.followable.m;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import dl0.C6822c;
import h6.C7416u;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.FloatSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import ll0.InterfaceC7871a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ql0.InterfaceC8453a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation3/module/operablecard/a.class */
@StabilityInferred(parameters = 0)
@Serializable
public final class a implements InterfaceC7871a, InterfaceC8453a, l {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final Lazy<KSerializer<Object>>[] f71390s;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f71391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f71392b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f71393c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final String f71394d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f71395e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f71396f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final String f71397g;

    @NotNull
    public final String h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final String f71398i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final String f71399j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final String f71400k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final String f71401l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final BizType f71402m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final Map<String, String> f71403n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final String f71404o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final Map<String, String> f71405p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final long f71406q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final C6822c f71407r;

    /* JADX INFO: renamed from: com.bilibili.ogv.operation3.module.operablecard.a$a, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation3/module/operablecard/a$a.class */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    @StabilityInferred(parameters = 0)
    public static final /* synthetic */ class C0446a implements GeneratedSerializer<a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final C0446a f71408a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final PluginGeneratedSerialDescriptor f71409b;

        /* JADX WARN: Type inference failed for: r0v0, types: [com.bilibili.ogv.operation3.module.operablecard.a$a, java.lang.Object, kotlinx.serialization.internal.GeneratedSerializer] */
        static {
            ?? obj = new Object();
            f71408a = obj;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.bilibili.ogv.operation3.module.operablecard.OperableCard", (GeneratedSerializer) obj, 18);
            pluginGeneratedSerialDescriptor.addElement("imgUrl", true);
            pluginGeneratedSerialDescriptor.addElement("title", true);
            pluginGeneratedSerialDescriptor.addElement("subtitle", true);
            pluginGeneratedSerialDescriptor.addElement("badgeImgUrl", true);
            pluginGeneratedSerialDescriptor.addElement(NotificationCompat.CATEGORY_PROGRESS, true);
            pluginGeneratedSerialDescriptor.addElement(EditCustomizeSticker.TAG_RANK, true);
            pluginGeneratedSerialDescriptor.addElement("coverRankImgUrl", true);
            pluginGeneratedSerialDescriptor.addElement("coverText", true);
            pluginGeneratedSerialDescriptor.addElement("viewCount", true);
            pluginGeneratedSerialDescriptor.addElement("danmakuCount", true);
            pluginGeneratedSerialDescriptor.addElement("score", true);
            pluginGeneratedSerialDescriptor.addElement("upName", true);
            pluginGeneratedSerialDescriptor.addElement("type", true);
            pluginGeneratedSerialDescriptor.addElement("resource_report", true);
            pluginGeneratedSerialDescriptor.addElement("url", true);
            pluginGeneratedSerialDescriptor.addElement("report", true);
            pluginGeneratedSerialDescriptor.addElement("season_id", true);
            pluginGeneratedSerialDescriptor.addElement(NotificationCompat.CATEGORY_STATUS, true);
            f71409b = pluginGeneratedSerialDescriptor;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public final KSerializer<?>[] childSerializers() {
            Lazy<KSerializer<Object>>[] lazyArr = a.f71390s;
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, stringSerializer, FloatSerializer.INSTANCE, IntSerializer.INSTANCE, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, lazyArr[12].getValue(), lazyArr[13].getValue(), stringSerializer, lazyArr[15].getValue(), LongSerializer.INSTANCE, C6822c.a.f116496a};
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
        public final Object deserialize(Decoder decoder) throws UnknownFieldException {
            float fDecodeFloatElement;
            Map map;
            String strDecodeStringElement;
            String strDecodeStringElement2;
            String strDecodeStringElement3;
            long jDecodeLongElement;
            String strDecodeStringElement4;
            int i7;
            BizType bizType;
            int iDecodeIntElement;
            String strDecodeStringElement5;
            String str;
            String strDecodeStringElement6;
            C6822c c6822c;
            Map map2;
            String strDecodeStringElement7;
            String str2;
            String strDecodeStringElement8;
            String str3;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f71409b;
            CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
            Lazy<KSerializer<Object>>[] lazyArr = a.f71390s;
            int i8 = 8;
            int i9 = 5;
            if (compositeDecoderBeginStructure.decodeSequentially()) {
                strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 0);
                strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 1);
                strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 2);
                String strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 3);
                fDecodeFloatElement = compositeDecoderBeginStructure.decodeFloatElement(pluginGeneratedSerialDescriptor, 4);
                iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(pluginGeneratedSerialDescriptor, 5);
                String strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 6);
                strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 7);
                String strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 8);
                strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 9);
                strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 10);
                String strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 11);
                bizType = (BizType) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 12, (DeserializationStrategy) lazyArr[12].getValue(), (Object) null);
                Map map3 = (Map) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 13, (DeserializationStrategy) lazyArr[13].getValue(), (Object) null);
                strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 14);
                map2 = (Map) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 15, (DeserializationStrategy) lazyArr[15].getValue(), (Object) null);
                jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(pluginGeneratedSerialDescriptor, 16);
                i7 = 262143;
                strDecodeStringElement3 = strDecodeStringElement9;
                str3 = strDecodeStringElement10;
                str2 = strDecodeStringElement11;
                str = strDecodeStringElement12;
                map = map3;
                c6822c = (C6822c) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 17, C6822c.a.f116496a, (Object) null);
            } else {
                fDecodeFloatElement = 0.0f;
                boolean z6 = true;
                map = null;
                C6822c c6822c2 = null;
                Map map4 = null;
                strDecodeStringElement = null;
                strDecodeStringElement2 = null;
                strDecodeStringElement3 = null;
                String strDecodeStringElement13 = null;
                String strDecodeStringElement14 = null;
                String strDecodeStringElement15 = null;
                String strDecodeStringElement16 = null;
                String strDecodeStringElement17 = null;
                String strDecodeStringElement18 = null;
                String strDecodeStringElement19 = null;
                jDecodeLongElement = 0;
                strDecodeStringElement4 = null;
                int iDecodeIntElement2 = 0;
                i7 = 0;
                bizType = null;
                while (z6) {
                    int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                    switch (iDecodeElementIndex) {
                        case -1:
                            z6 = false;
                            i8 = 8;
                            i9 = 5;
                            break;
                        case 0:
                            strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 0);
                            i7 |= 1;
                            i8 = 8;
                            i9 = 5;
                            break;
                        case 1:
                            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 1);
                            i7 |= 2;
                            i8 = 8;
                            i9 = 5;
                            break;
                        case 2:
                            strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 2);
                            i7 |= 4;
                            i8 = 8;
                            i9 = 5;
                            break;
                        case 3:
                            strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 3);
                            i7 |= 8;
                            i8 = 8;
                            i9 = 5;
                            break;
                        case 4:
                            fDecodeFloatElement = compositeDecoderBeginStructure.decodeFloatElement(pluginGeneratedSerialDescriptor, 4);
                            i7 |= 16;
                            i8 = 8;
                            break;
                        case 5:
                            iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(pluginGeneratedSerialDescriptor, i9);
                            i7 |= 32;
                            i8 = 8;
                            break;
                        case 6:
                            strDecodeStringElement13 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 6);
                            i7 |= 64;
                            i9 = 5;
                            break;
                        case 7:
                            strDecodeStringElement14 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 7);
                            i7 |= 128;
                            i9 = 5;
                            break;
                        case 8:
                            strDecodeStringElement15 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, i8);
                            i7 |= 256;
                            i9 = 5;
                            break;
                        case 9:
                            strDecodeStringElement16 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 9);
                            i7 |= 512;
                            i9 = 5;
                            break;
                        case 10:
                            strDecodeStringElement17 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 10);
                            i7 |= 1024;
                            i9 = 5;
                            break;
                        case 11:
                            strDecodeStringElement18 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 11);
                            i7 |= 2048;
                            i9 = 5;
                            break;
                        case 12:
                            bizType = (BizType) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 12, (DeserializationStrategy) lazyArr[12].getValue(), bizType);
                            i7 |= 4096;
                            i9 = 5;
                            break;
                        case 13:
                            map = (Map) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 13, (DeserializationStrategy) lazyArr[13].getValue(), map);
                            i7 |= 8192;
                            i9 = 5;
                            break;
                        case 14:
                            strDecodeStringElement19 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 14);
                            i7 |= 16384;
                            i9 = 5;
                            break;
                        case 15:
                            map4 = (Map) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 15, (DeserializationStrategy) lazyArr[15].getValue(), map4);
                            i7 |= 32768;
                            i9 = 5;
                            break;
                        case 16:
                            jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(pluginGeneratedSerialDescriptor, 16);
                            i7 |= 65536;
                            i9 = 5;
                            break;
                        case 17:
                            c6822c2 = (C6822c) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 17, C6822c.a.f116496a, c6822c2);
                            i7 |= 131072;
                            i9 = 5;
                            break;
                        default:
                            throw new UnknownFieldException(iDecodeElementIndex);
                    }
                }
                iDecodeIntElement = iDecodeIntElement2;
                String str4 = strDecodeStringElement15;
                String str5 = strDecodeStringElement16;
                strDecodeStringElement5 = strDecodeStringElement17;
                str = strDecodeStringElement18;
                strDecodeStringElement6 = strDecodeStringElement19;
                c6822c = c6822c2;
                map2 = map4;
                strDecodeStringElement7 = str5;
                str2 = str4;
                strDecodeStringElement8 = strDecodeStringElement14;
                str3 = strDecodeStringElement13;
            }
            compositeDecoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
            return new a(i7, strDecodeStringElement4, strDecodeStringElement, strDecodeStringElement2, strDecodeStringElement3, fDecodeFloatElement, iDecodeIntElement, str3, strDecodeStringElement8, str2, strDecodeStringElement7, strDecodeStringElement5, str, bizType, map, strDecodeStringElement6, map2, jDecodeLongElement, c6822c);
        }

        @NotNull
        public final SerialDescriptor getDescriptor() {
            return f71409b;
        }

        public final void serialize(Encoder encoder, Object obj) {
            a aVar = (a) obj;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f71409b;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
            b bVar = a.Companion;
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 0) || !Intrinsics.areEqual(aVar.f71391a, "")) {
                compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 0, aVar.f71391a);
            }
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 1) || !Intrinsics.areEqual(aVar.f71392b, "")) {
                compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 1, aVar.f71392b);
            }
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 2) || !Intrinsics.areEqual(aVar.f71393c, "")) {
                compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 2, aVar.f71393c);
            }
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 3) || !Intrinsics.areEqual(aVar.f71394d, "")) {
                compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 3, aVar.f71394d);
            }
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 4) || Float.compare(aVar.f71395e, 0.0f) != 0) {
                compositeEncoderBeginStructure.encodeFloatElement(pluginGeneratedSerialDescriptor, 4, aVar.f71395e);
            }
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 5) || aVar.f71396f != 0) {
                compositeEncoderBeginStructure.encodeIntElement(pluginGeneratedSerialDescriptor, 5, aVar.f71396f);
            }
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 6) || !Intrinsics.areEqual(aVar.f71397g, "")) {
                compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 6, aVar.f71397g);
            }
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 7) || !Intrinsics.areEqual(aVar.h, "")) {
                compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 7, aVar.h);
            }
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 8) || !Intrinsics.areEqual(aVar.f71398i, "")) {
                compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 8, aVar.f71398i);
            }
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 9) || !Intrinsics.areEqual(aVar.f71399j, "")) {
                compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 9, aVar.f71399j);
            }
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 10) || !Intrinsics.areEqual(aVar.f71400k, "")) {
                compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 10, aVar.f71400k);
            }
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 11) || !Intrinsics.areEqual(aVar.f71401l, "")) {
                compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 11, aVar.f71401l);
            }
            boolean zShouldEncodeElementDefault = compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 12);
            Lazy<KSerializer<Object>>[] lazyArr = a.f71390s;
            if (zShouldEncodeElementDefault || aVar.f71402m != BizType.PGC) {
                compositeEncoderBeginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 12, (SerializationStrategy) lazyArr[12].getValue(), aVar.f71402m);
            }
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 13) || !Intrinsics.areEqual(aVar.f71403n, MapsKt.emptyMap())) {
                compositeEncoderBeginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 13, (SerializationStrategy) lazyArr[13].getValue(), aVar.f71403n);
            }
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 14) || !Intrinsics.areEqual(aVar.f71404o, "")) {
                compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 14, aVar.f71404o);
            }
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 15) || !Intrinsics.areEqual(aVar.f71405p, MapsKt.emptyMap())) {
                compositeEncoderBeginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 15, (SerializationStrategy) lazyArr[15].getValue(), aVar.f71405p);
            }
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 16) || aVar.f71406q != 0) {
                compositeEncoderBeginStructure.encodeLongElement(pluginGeneratedSerialDescriptor, 16, aVar.f71406q);
            }
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 17) || !Intrinsics.areEqual(aVar.f71407r, new C6822c(false))) {
                compositeEncoderBeginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 17, C6822c.a.f116496a, aVar.f71407r);
            }
            compositeEncoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
        }

        @NotNull
        public final /* bridge */ KSerializer<?>[] typeParametersSerializers() {
            return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation3/module/operablecard/a$b.class */
    public static final class b {
        @NotNull
        public final KSerializer<a> serializer() {
            return C0446a.f71408a;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f71390s = new Lazy[]{null, null, null, null, null, null, null, null, null, null, null, null, LazyKt.lazy(lazyThreadSafetyMode, new C1698b5(10)), LazyKt.lazy(lazyThreadSafetyMode, new C1706c5(9)), null, LazyKt.lazy(lazyThreadSafetyMode, new C1714d5(6)), null, null};
    }

    public a() {
        this(null, null, null, null, null, 262143);
    }

    public a(int i7, String str, String str2, String str3, String str4, float f7, int i8, String str5, String str6, String str7, String str8, String str9, String str10, BizType bizType, Map map, String str11, Map map2, long j7, C6822c c6822c) {
        if ((i7 & 1) == 0) {
            this.f71391a = "";
        } else {
            this.f71391a = str;
        }
        if ((i7 & 2) == 0) {
            this.f71392b = "";
        } else {
            this.f71392b = str2;
        }
        if ((i7 & 4) == 0) {
            this.f71393c = "";
        } else {
            this.f71393c = str3;
        }
        if ((i7 & 8) == 0) {
            this.f71394d = "";
        } else {
            this.f71394d = str4;
        }
        this.f71395e = (i7 & 16) == 0 ? 0.0f : f7;
        if ((i7 & 32) == 0) {
            this.f71396f = 0;
        } else {
            this.f71396f = i8;
        }
        if ((i7 & 64) == 0) {
            this.f71397g = "";
        } else {
            this.f71397g = str5;
        }
        if ((i7 & 128) == 0) {
            this.h = "";
        } else {
            this.h = str6;
        }
        if ((i7 & 256) == 0) {
            this.f71398i = "";
        } else {
            this.f71398i = str7;
        }
        if ((i7 & 512) == 0) {
            this.f71399j = "";
        } else {
            this.f71399j = str8;
        }
        if ((i7 & 1024) == 0) {
            this.f71400k = "";
        } else {
            this.f71400k = str9;
        }
        if ((i7 & 2048) == 0) {
            this.f71401l = "";
        } else {
            this.f71401l = str10;
        }
        this.f71402m = (i7 & 4096) == 0 ? BizType.PGC : bizType;
        this.f71403n = (i7 & 8192) == 0 ? MapsKt.emptyMap() : map;
        if ((i7 & 16384) == 0) {
            this.f71404o = "";
        } else {
            this.f71404o = str11;
        }
        this.f71405p = (32768 & i7) == 0 ? MapsKt.emptyMap() : map2;
        this.f71406q = (65536 & i7) == 0 ? 0L : j7;
        this.f71407r = (i7 & 131072) == 0 ? new C6822c(false) : c6822c;
    }

    public a(String str, String str2, String str3, String str4, String str5, int i7) {
        str = (i7 & 1) != 0 ? "" : str;
        str2 = (i7 & 2) != 0 ? "" : str2;
        str3 = (i7 & 128) != 0 ? "" : str3;
        str4 = (i7 & 256) != 0 ? "" : str4;
        str5 = (i7 & 512) != 0 ? "" : str5;
        BizType bizType = BizType.PGC;
        Map<String, String> mapEmptyMap = MapsKt.emptyMap();
        Map<String, String> mapEmptyMap2 = MapsKt.emptyMap();
        C6822c c6822c = new C6822c(false);
        this.f71391a = str;
        this.f71392b = str2;
        this.f71393c = "";
        this.f71394d = "";
        this.f71395e = 0.0f;
        this.f71396f = 0;
        this.f71397g = "";
        this.h = str3;
        this.f71398i = str4;
        this.f71399j = str5;
        this.f71400k = "";
        this.f71401l = "";
        this.f71402m = bizType;
        this.f71403n = mapEmptyMap;
        this.f71404o = "";
        this.f71405p = mapEmptyMap2;
        this.f71406q = 0L;
        this.f71407r = c6822c;
    }

    @Override // com.bilibili.ogv.operation3.module.followable.l
    public final long c() {
        return this.f71406q;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.f71391a, aVar.f71391a) && Intrinsics.areEqual(this.f71392b, aVar.f71392b) && Intrinsics.areEqual(this.f71393c, aVar.f71393c) && Intrinsics.areEqual(this.f71394d, aVar.f71394d) && Float.compare(this.f71395e, aVar.f71395e) == 0 && this.f71396f == aVar.f71396f && Intrinsics.areEqual(this.f71397g, aVar.f71397g) && Intrinsics.areEqual(this.h, aVar.h) && Intrinsics.areEqual(this.f71398i, aVar.f71398i) && Intrinsics.areEqual(this.f71399j, aVar.f71399j) && Intrinsics.areEqual(this.f71400k, aVar.f71400k) && Intrinsics.areEqual(this.f71401l, aVar.f71401l) && this.f71402m == aVar.f71402m && Intrinsics.areEqual(this.f71403n, aVar.f71403n) && Intrinsics.areEqual(this.f71404o, aVar.f71404o) && Intrinsics.areEqual(this.f71405p, aVar.f71405p) && this.f71406q == aVar.f71406q && Intrinsics.areEqual(this.f71407r, aVar.f71407r);
    }

    @Override // ql0.InterfaceC8453a
    @NotNull
    public final Map<String, String> getReport() {
        return this.f71405p;
    }

    @Override // com.bilibili.ogv.operation3.module.followable.l
    public final m getStatus() {
        return this.f71407r;
    }

    @Override // ll0.InterfaceC7871a
    @NotNull
    public final String getUrl() {
        return this.f71404o;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f71407r.f116495a) + C3554n0.a(g.a(E.a(g.a((this.f71402m.hashCode() + E.a(E.a(E.a(E.a(E.a(E.a(I.a(this.f71396f, n.a(this.f71395e, E.a(E.a(E.a(this.f71391a.hashCode() * 31, 31, this.f71392b), 31, this.f71393c), 31, this.f71394d), 31), 31), 31, this.f71397g), 31, this.h), 31, this.f71398i), 31, this.f71399j), 31, this.f71400k), 31, this.f71401l)) * 31, this.f71403n, 31), 31, this.f71404o), this.f71405p, 31), 31, this.f71406q);
    }

    @NotNull
    public final String toString() {
        Map<String, String> map = this.f71403n;
        Map<String, String> map2 = this.f71405p;
        StringBuilder sb = new StringBuilder("OperableCard(imgUrl=");
        sb.append(this.f71391a);
        sb.append(", title=");
        sb.append(this.f71392b);
        sb.append(", subtitle=");
        sb.append(this.f71393c);
        sb.append(", badgeImgUrl=");
        sb.append(this.f71394d);
        sb.append(", progress=");
        sb.append(this.f71395e);
        sb.append(", rank=");
        sb.append(this.f71396f);
        sb.append(", coverRankImgUrl=");
        sb.append(this.f71397g);
        sb.append(", coverText=");
        sb.append(this.h);
        sb.append(", viewCount=");
        sb.append(this.f71398i);
        sb.append(", danmakuCount=");
        sb.append(this.f71399j);
        sb.append(", score=");
        sb.append(this.f71400k);
        sb.append(", upName=");
        sb.append(this.f71401l);
        sb.append(", type=");
        sb.append(this.f71402m);
        sb.append(", resource_report=");
        sb.append(map);
        sb.append(", url=");
        C7416u.a(sb, this.f71404o, ", report=", map2, ", season_id=");
        sb.append(this.f71406q);
        sb.append(", status=");
        sb.append(this.f71407r);
        sb.append(")");
        return sb.toString();
    }
}
