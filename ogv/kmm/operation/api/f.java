package com.bilibili.ogv.kmm.operation.api;

import F3.y6;
import F3.z6;
import androidx.compose.animation.z;
import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.internal.StabilityInferred;
import bl0.InterfaceC5118d;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.CollectionsKt;
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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sj0.C8595a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/api/f.class */
@StabilityInferred(parameters = 0)
@Serializable
public final class f {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final Lazy<KSerializer<Object>>[] f67985g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final List<InterfaceC5118d> f67986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Map<String, String> f67987b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f67988c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final String f67989d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f67990e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f67991f;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/api/f$a.class */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    @StabilityInferred(parameters = 0)
    public static final /* synthetic */ class a implements GeneratedSerializer<f> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f67992a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final PluginGeneratedSerialDescriptor f67993b;

        /* JADX WARN: Type inference failed for: r0v0, types: [com.bilibili.ogv.kmm.operation.api.f$a, java.lang.Object, kotlinx.serialization.internal.GeneratedSerializer] */
        static {
            ?? obj = new Object();
            f67992a = obj;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.bilibili.ogv.kmm.operation.api.PageData", (GeneratedSerializer) obj, 6);
            pluginGeneratedSerialDescriptor.addElement("modules", true);
            pluginGeneratedSerialDescriptor.addElement("report", true);
            pluginGeneratedSerialDescriptor.addElement("has_next", true);
            pluginGeneratedSerialDescriptor.addElement("next_cursor", true);
            pluginGeneratedSerialDescriptor.addElement("selected_module_id", true);
            pluginGeneratedSerialDescriptor.addElement("jump_to_module", true);
            f67993b = pluginGeneratedSerialDescriptor;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public final KSerializer<?>[] childSerializers() {
            Lazy<KSerializer<Object>>[] lazyArr = f.f67985g;
            Object value = lazyArr[0].getValue();
            Object value2 = lazyArr[1].getValue();
            C8595a c8595a = C8595a.f127260a;
            KSerializer nullable = BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE);
            LongSerializer longSerializer = LongSerializer.INSTANCE;
            return new KSerializer[]{value, value2, c8595a, nullable, longSerializer, longSerializer};
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
        public final Object deserialize(Decoder decoder) throws UnknownFieldException {
            int i7;
            List list;
            Map map;
            String str;
            boolean zBooleanValue;
            long jDecodeLongElement;
            long jDecodeLongElement2;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f67993b;
            CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
            Lazy<KSerializer<Object>>[] lazyArr = f.f67985g;
            if (compositeDecoderBeginStructure.decodeSequentially()) {
                list = (List) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 0, (DeserializationStrategy) lazyArr[0].getValue(), (Object) null);
                Map map2 = (Map) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 1, (DeserializationStrategy) lazyArr[1].getValue(), (Object) null);
                zBooleanValue = ((Boolean) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 2, C8595a.f127260a, Boolean.FALSE)).booleanValue();
                String str2 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 3, StringSerializer.INSTANCE, (Object) null);
                jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(pluginGeneratedSerialDescriptor, 4);
                i7 = 63;
                map = map2;
                str = str2;
                jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(pluginGeneratedSerialDescriptor, 5);
            } else {
                long jDecodeLongElement3 = 0;
                boolean z6 = true;
                i7 = 0;
                list = null;
                map = null;
                str = null;
                long jDecodeLongElement4 = 0;
                zBooleanValue = false;
                while (z6) {
                    int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                    switch (iDecodeElementIndex) {
                        case -1:
                            z6 = false;
                            break;
                        case 0:
                            list = (List) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 0, (DeserializationStrategy) lazyArr[0].getValue(), list);
                            i7 |= 1;
                            break;
                        case 1:
                            map = (Map) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 1, (DeserializationStrategy) lazyArr[1].getValue(), map);
                            i7 |= 2;
                            break;
                        case 2:
                            zBooleanValue = ((Boolean) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 2, C8595a.f127260a, Boolean.valueOf(zBooleanValue))).booleanValue();
                            i7 |= 4;
                            break;
                        case 3:
                            str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 3, StringSerializer.INSTANCE, str);
                            i7 |= 8;
                            break;
                        case 4:
                            jDecodeLongElement3 = compositeDecoderBeginStructure.decodeLongElement(pluginGeneratedSerialDescriptor, 4);
                            i7 |= 16;
                            break;
                        case 5:
                            jDecodeLongElement4 = compositeDecoderBeginStructure.decodeLongElement(pluginGeneratedSerialDescriptor, 5);
                            i7 |= 32;
                            break;
                        default:
                            throw new UnknownFieldException(iDecodeElementIndex);
                    }
                }
                jDecodeLongElement = jDecodeLongElement4;
                jDecodeLongElement2 = jDecodeLongElement3;
            }
            compositeDecoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
            return new f(i7, list, map, zBooleanValue, str, jDecodeLongElement2, jDecodeLongElement);
        }

        @NotNull
        public final SerialDescriptor getDescriptor() {
            return f67993b;
        }

        public final void serialize(Encoder encoder, Object obj) {
            f fVar = (f) obj;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f67993b;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
            b bVar = f.Companion;
            boolean zShouldEncodeElementDefault = compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 0);
            Lazy<KSerializer<Object>>[] lazyArr = f.f67985g;
            if (zShouldEncodeElementDefault || !Intrinsics.areEqual(fVar.f67986a, CollectionsKt.emptyList())) {
                compositeEncoderBeginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 0, (SerializationStrategy) lazyArr[0].getValue(), fVar.f67986a);
            }
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 1) || !Intrinsics.areEqual(fVar.f67987b, MapsKt.emptyMap())) {
                compositeEncoderBeginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 1, (SerializationStrategy) lazyArr[1].getValue(), fVar.f67987b);
            }
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 2) || fVar.f67988c) {
                compositeEncoderBeginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 2, C8595a.f127260a, Boolean.valueOf(fVar.f67988c));
            }
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 3) || fVar.f67989d != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 3, StringSerializer.INSTANCE, fVar.f67989d);
            }
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 4) || fVar.f67990e != 0) {
                compositeEncoderBeginStructure.encodeLongElement(pluginGeneratedSerialDescriptor, 4, fVar.f67990e);
            }
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 5) || fVar.f67991f != 0) {
                compositeEncoderBeginStructure.encodeLongElement(pluginGeneratedSerialDescriptor, 5, fVar.f67991f);
            }
            compositeEncoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
        }

        @NotNull
        public final /* bridge */ KSerializer<?>[] typeParametersSerializers() {
            return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/api/f$b.class */
    public static final class b {
        @NotNull
        public final KSerializer<f> serializer() {
            return a.f67992a;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f67985g = new Lazy[]{LazyKt.lazy(lazyThreadSafetyMode, new y6(10)), LazyKt.lazy(lazyThreadSafetyMode, new z6(8)), null, null, null, null};
    }

    public f() {
        List<InterfaceC5118d> listEmptyList = CollectionsKt.emptyList();
        Map<String, String> mapEmptyMap = MapsKt.emptyMap();
        this.f67986a = listEmptyList;
        this.f67987b = mapEmptyMap;
        this.f67988c = false;
        this.f67989d = null;
        this.f67990e = 0L;
        this.f67991f = 0L;
    }

    public f(int i7, List list, Map map, boolean z6, String str, long j7, long j8) {
        this.f67986a = (i7 & 1) == 0 ? CollectionsKt.emptyList() : list;
        if ((i7 & 2) == 0) {
            this.f67987b = MapsKt.emptyMap();
        } else {
            this.f67987b = map;
        }
        if ((i7 & 4) == 0) {
            this.f67988c = false;
        } else {
            this.f67988c = z6;
        }
        if ((i7 & 8) == 0) {
            this.f67989d = null;
        } else {
            this.f67989d = str;
        }
        if ((i7 & 16) == 0) {
            this.f67990e = 0L;
        } else {
            this.f67990e = j7;
        }
        if ((i7 & 32) == 0) {
            this.f67991f = 0L;
        } else {
            this.f67991f = j8;
        }
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.areEqual(this.f67986a, fVar.f67986a) && Intrinsics.areEqual(this.f67987b, fVar.f67987b) && this.f67988c == fVar.f67988c && Intrinsics.areEqual(this.f67989d, fVar.f67989d) && this.f67990e == fVar.f67990e && this.f67991f == fVar.f67991f;
    }

    public final int hashCode() {
        int iA = z.a(J2.g.a(this.f67986a.hashCode() * 31, this.f67987b, 31), 31, this.f67988c);
        String str = this.f67989d;
        return Long.hashCode(this.f67991f) + C3554n0.a((iA + (str == null ? 0 : str.hashCode())) * 31, 31, this.f67990e);
    }

    @NotNull
    public final String toString() {
        List<InterfaceC5118d> list = this.f67986a;
        Map<String, String> map = this.f67987b;
        StringBuilder sb = new StringBuilder("PageData(modules=");
        sb.append(list);
        sb.append(", report=");
        sb.append(map);
        sb.append(", has_next=");
        sb.append(this.f67988c);
        sb.append(", next_cursor=");
        sb.append(this.f67989d);
        sb.append(", selected_module_id=");
        sb.append(this.f67990e);
        sb.append(", jump_to_module=");
        return android.support.v4.media.session.a.a(sb, this.f67991f, ")");
    }
}
