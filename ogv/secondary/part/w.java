package com.bilibili.ogv.secondary.part;

import G3.C1948t;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.exoplayer.analytics.C4665g;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
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
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import ll0.InterfaceC7871a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ql0.InterfaceC8453a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/secondary/part/w.class */
@StabilityInferred(parameters = 0)
@Serializable
public final class w implements InterfaceC7871a, InterfaceC8453a {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final Lazy<KSerializer<Object>>[] f72903i = {null, null, null, null, null, null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new C1948t(9))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f72904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f72905b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f72906c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f72907d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final String f72908e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f72909f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final String f72910g;

    @NotNull
    public final Map<String, String> h;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/secondary/part/w$a.class */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    @StabilityInferred(parameters = 0)
    public static final /* synthetic */ class a implements GeneratedSerializer<w> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f72911a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final PluginGeneratedSerialDescriptor f72912b;

        /* JADX WARN: Type inference failed for: r0v0, types: [com.bilibili.ogv.secondary.part.w$a, java.lang.Object, kotlinx.serialization.internal.GeneratedSerializer] */
        static {
            ?? obj = new Object();
            f72911a = obj;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.bilibili.ogv.secondary.part.FallRegionItem", (GeneratedSerializer) obj, 8);
            pluginGeneratedSerialDescriptor.addElement("title", false);
            pluginGeneratedSerialDescriptor.addElement("cover", false);
            pluginGeneratedSerialDescriptor.addElement("danmaku", true);
            pluginGeneratedSerialDescriptor.addElement(EditCustomizeSticker.TAG_DURATION, true);
            pluginGeneratedSerialDescriptor.addElement("cover_left_text_1", true);
            pluginGeneratedSerialDescriptor.addElement("cover_left_icon_1", true);
            pluginGeneratedSerialDescriptor.addElement(EditCustomizeSticker.TAG_URI, false);
            pluginGeneratedSerialDescriptor.addElement("report", true);
            f72912b = pluginGeneratedSerialDescriptor;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public final KSerializer<?>[] childSerializers() {
            Lazy<KSerializer<Object>>[] lazyArr = w.f72903i;
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            IntSerializer intSerializer = IntSerializer.INSTANCE;
            return new KSerializer[]{stringSerializer, stringSerializer, intSerializer, intSerializer, BuiltinSerializersKt.getNullable(stringSerializer), intSerializer, stringSerializer, lazyArr[7].getValue()};
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
        public final Object deserialize(Decoder decoder) throws UnknownFieldException {
            int iDecodeIntElement;
            Map map;
            String strDecodeStringElement;
            String strDecodeStringElement2;
            String strDecodeStringElement3;
            String str;
            int iDecodeIntElement2;
            int i7;
            int i8;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f72912b;
            CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
            Lazy<KSerializer<Object>>[] lazyArr = w.f72903i;
            if (compositeDecoderBeginStructure.decodeSequentially()) {
                strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 0);
                strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 1);
                int iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(pluginGeneratedSerialDescriptor, 2);
                int iDecodeIntElement4 = compositeDecoderBeginStructure.decodeIntElement(pluginGeneratedSerialDescriptor, 3);
                String str2 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 4, StringSerializer.INSTANCE, (Object) null);
                i8 = 255;
                iDecodeIntElement = iDecodeIntElement3;
                i7 = iDecodeIntElement4;
                str = str2;
                iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(pluginGeneratedSerialDescriptor, 5);
                strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 6);
                map = (Map) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 7, (DeserializationStrategy) lazyArr[7].getValue(), (Object) null);
            } else {
                boolean z6 = true;
                iDecodeIntElement = 0;
                int iDecodeIntElement5 = 0;
                int i9 = 0;
                map = null;
                strDecodeStringElement = null;
                strDecodeStringElement2 = null;
                strDecodeStringElement3 = null;
                str = null;
                int iDecodeIntElement6 = 0;
                while (z6) {
                    int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                    switch (iDecodeElementIndex) {
                        case -1:
                            z6 = false;
                            break;
                        case 0:
                            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 0);
                            i9 |= 1;
                            break;
                        case 1:
                            strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 1);
                            i9 |= 2;
                            break;
                        case 2:
                            iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(pluginGeneratedSerialDescriptor, 2);
                            i9 |= 4;
                            break;
                        case 3:
                            iDecodeIntElement5 = compositeDecoderBeginStructure.decodeIntElement(pluginGeneratedSerialDescriptor, 3);
                            i9 |= 8;
                            break;
                        case 4:
                            str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 4, StringSerializer.INSTANCE, str);
                            i9 |= 16;
                            break;
                        case 5:
                            iDecodeIntElement6 = compositeDecoderBeginStructure.decodeIntElement(pluginGeneratedSerialDescriptor, 5);
                            i9 |= 32;
                            break;
                        case 6:
                            strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 6);
                            i9 |= 64;
                            break;
                        case 7:
                            map = (Map) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 7, (DeserializationStrategy) lazyArr[7].getValue(), map);
                            i9 |= 128;
                            break;
                        default:
                            throw new UnknownFieldException(iDecodeElementIndex);
                    }
                }
                iDecodeIntElement2 = iDecodeIntElement6;
                i7 = iDecodeIntElement5;
                i8 = i9;
            }
            compositeDecoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
            return new w(i8, strDecodeStringElement, strDecodeStringElement2, iDecodeIntElement, i7, str, iDecodeIntElement2, strDecodeStringElement3, map);
        }

        @NotNull
        public final SerialDescriptor getDescriptor() {
            return f72912b;
        }

        public final void serialize(Encoder encoder, Object obj) {
            w wVar = (w) obj;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f72912b;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
            compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 0, wVar.f72904a);
            compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 1, wVar.f72905b);
            boolean zShouldEncodeElementDefault = compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 2);
            int i7 = wVar.f72906c;
            if (zShouldEncodeElementDefault || i7 != 0) {
                compositeEncoderBeginStructure.encodeIntElement(pluginGeneratedSerialDescriptor, 2, i7);
            }
            boolean zShouldEncodeElementDefault2 = compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 3);
            int i8 = wVar.f72907d;
            if (zShouldEncodeElementDefault2 || i8 != 0) {
                compositeEncoderBeginStructure.encodeIntElement(pluginGeneratedSerialDescriptor, 3, i8);
            }
            boolean zShouldEncodeElementDefault3 = compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 4);
            String str = wVar.f72908e;
            if (zShouldEncodeElementDefault3 || str != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 4, StringSerializer.INSTANCE, str);
            }
            boolean zShouldEncodeElementDefault4 = compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 5);
            int i9 = wVar.f72909f;
            if (zShouldEncodeElementDefault4 || i9 != 1) {
                compositeEncoderBeginStructure.encodeIntElement(pluginGeneratedSerialDescriptor, 5, i9);
            }
            compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 6, wVar.f72910g);
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 7) || !Intrinsics.areEqual(wVar.h, MapsKt.emptyMap())) {
                compositeEncoderBeginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 7, (SerializationStrategy) w.f72903i[7].getValue(), wVar.h);
            }
            compositeEncoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
        }

        @NotNull
        public final /* bridge */ KSerializer<?>[] typeParametersSerializers() {
            return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/secondary/part/w$b.class */
    public static final class b {
        @NotNull
        public final KSerializer<w> serializer() {
            return a.f72911a;
        }
    }

    public w(int i7, int i8, int i9, @NotNull String str, @NotNull String str2, @Nullable String str3, @NotNull String str4, @NotNull Map map) {
        this.f72904a = str;
        this.f72905b = str2;
        this.f72906c = i7;
        this.f72907d = i8;
        this.f72908e = str3;
        this.f72909f = i9;
        this.f72910g = str4;
        this.h = map;
    }

    public w(int i7, String str, String str2, int i8, int i9, String str3, int i10, String str4, Map map) {
        if (67 != (i7 & 67)) {
            PluginExceptionsKt.throwMissingFieldException(i7, 67, a.f72912b);
        }
        this.f72904a = str;
        this.f72905b = str2;
        if ((i7 & 4) == 0) {
            this.f72906c = 0;
        } else {
            this.f72906c = i8;
        }
        if ((i7 & 8) == 0) {
            this.f72907d = 0;
        } else {
            this.f72907d = i9;
        }
        if ((i7 & 16) == 0) {
            this.f72908e = null;
        } else {
            this.f72908e = str3;
        }
        if ((i7 & 32) == 0) {
            this.f72909f = 1;
        } else {
            this.f72909f = i10;
        }
        this.f72910g = str4;
        if ((i7 & 128) == 0) {
            this.h = MapsKt.emptyMap();
        } else {
            this.h = map;
        }
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return Intrinsics.areEqual(this.f72904a, wVar.f72904a) && Intrinsics.areEqual(this.f72905b, wVar.f72905b) && this.f72906c == wVar.f72906c && this.f72907d == wVar.f72907d && Intrinsics.areEqual(this.f72908e, wVar.f72908e) && this.f72909f == wVar.f72909f && Intrinsics.areEqual(this.f72910g, wVar.f72910g) && Intrinsics.areEqual(this.h, wVar.h);
    }

    @Override // ql0.InterfaceC8453a
    @NotNull
    public final String f() {
        return "pgc.{pageName}.operation.0.show";
    }

    @Override // ql0.InterfaceC8453a
    @NotNull
    public final String getClickEventId() {
        return "pgc.{pageName}.operation.works.click";
    }

    @Override // ql0.InterfaceC8453a
    @NotNull
    public final Map<String, String> getReport() {
        return this.h;
    }

    @Override // ll0.InterfaceC7871a
    @NotNull
    public final String getUrl() {
        return this.f72910g;
    }

    public final int hashCode() {
        int iA = androidx.compose.animation.core.I.a(this.f72907d, androidx.compose.animation.core.I.a(this.f72906c, I.E.a(this.f72904a.hashCode() * 31, 31, this.f72905b), 31), 31);
        String str = this.f72908e;
        return this.h.hashCode() + I.E.a(androidx.compose.animation.core.I.a(this.f72909f, (iA + (str == null ? 0 : str.hashCode())) * 31, 31), 31, this.f72910g);
    }

    @NotNull
    public final String toString() {
        Map<String, String> map = this.h;
        StringBuilder sb = new StringBuilder("FallRegionItem(title=");
        sb.append(this.f72904a);
        sb.append(", cover=");
        sb.append(this.f72905b);
        sb.append(", danmaku=");
        sb.append(this.f72906c);
        sb.append(", duration=");
        sb.append(this.f72907d);
        sb.append(", playedNumText=");
        sb.append(this.f72908e);
        sb.append(", playedNumIconType=");
        sb.append(this.f72909f);
        sb.append(", url=");
        return C4665g.a(sb, this.f72910g, ", report=", map, ")");
    }
}
