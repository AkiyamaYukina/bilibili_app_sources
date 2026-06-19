package com.bilibili.ogv.secondary.api;

import G3.C1939o;
import G3.C1941p;
import androidx.compose.animation.z;
import androidx.compose.runtime.internal.StabilityInferred;
import bl0.InterfaceC5118d;
import com.bilibili.ogv.secondary.api.a;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.CollectionsKt;
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
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sj0.C8595a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/secondary/api/c.class */
@StabilityInferred(parameters = 0)
@Serializable
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final Lazy<KSerializer<Object>>[] f72635f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final List<InterfaceC5118d> f72636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final Map<String, String> f72637b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f72638c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final String f72639d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final com.bilibili.ogv.secondary.api.a f72640e;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/secondary/api/c$a.class */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    @StabilityInferred(parameters = 0)
    public static final /* synthetic */ class a implements GeneratedSerializer<c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f72641a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final PluginGeneratedSerialDescriptor f72642b;

        /* JADX WARN: Type inference failed for: r0v0, types: [com.bilibili.ogv.secondary.api.c$a, java.lang.Object, kotlinx.serialization.internal.GeneratedSerializer] */
        static {
            ?? obj = new Object();
            f72641a = obj;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.bilibili.ogv.secondary.api.PartData", (GeneratedSerializer) obj, 5);
            pluginGeneratedSerialDescriptor.addElement("modules", true);
            pluginGeneratedSerialDescriptor.addElement("report", false);
            pluginGeneratedSerialDescriptor.addElement("has_next", false);
            pluginGeneratedSerialDescriptor.addElement("next_cursor", true);
            pluginGeneratedSerialDescriptor.addElement("feed", true);
            f72642b = pluginGeneratedSerialDescriptor;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public final KSerializer<?>[] childSerializers() {
            Lazy<KSerializer<Object>>[] lazyArr = c.f72635f;
            return new KSerializer[]{lazyArr[0].getValue(), BuiltinSerializersKt.getNullable((KSerializer) lazyArr[1].getValue()), C8595a.f127260a, BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE), BuiltinSerializersKt.getNullable(a.C0456a.f72628a)};
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
        public final Object deserialize(Decoder decoder) throws UnknownFieldException {
            boolean zBooleanValue;
            List list;
            Map map;
            int i7;
            com.bilibili.ogv.secondary.api.a aVar;
            String str;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f72642b;
            CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
            Lazy<KSerializer<Object>>[] lazyArr = c.f72635f;
            if (compositeDecoderBeginStructure.decodeSequentially()) {
                list = (List) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 0, (DeserializationStrategy) lazyArr[0].getValue(), (Object) null);
                Map map2 = (Map) compositeDecoderBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 1, (DeserializationStrategy) lazyArr[1].getValue(), (Object) null);
                zBooleanValue = ((Boolean) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 2, C8595a.f127260a, Boolean.FALSE)).booleanValue();
                String str2 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 3, StringSerializer.INSTANCE, (Object) null);
                aVar = (com.bilibili.ogv.secondary.api.a) compositeDecoderBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 4, a.C0456a.f72628a, (Object) null);
                i7 = 31;
                map = map2;
                str = str2;
            } else {
                boolean z6 = true;
                zBooleanValue = false;
                list = null;
                map = null;
                String str3 = null;
                com.bilibili.ogv.secondary.api.a aVar2 = null;
                i7 = 0;
                while (z6) {
                    int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                    if (iDecodeElementIndex == -1) {
                        z6 = false;
                    } else if (iDecodeElementIndex == 0) {
                        list = (List) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 0, (DeserializationStrategy) lazyArr[0].getValue(), list);
                        i7 |= 1;
                    } else if (iDecodeElementIndex == 1) {
                        map = (Map) compositeDecoderBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 1, (DeserializationStrategy) lazyArr[1].getValue(), map);
                        i7 |= 2;
                    } else if (iDecodeElementIndex == 2) {
                        zBooleanValue = ((Boolean) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 2, C8595a.f127260a, Boolean.valueOf(zBooleanValue))).booleanValue();
                        i7 |= 4;
                    } else if (iDecodeElementIndex == 3) {
                        str3 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 3, StringSerializer.INSTANCE, str3);
                        i7 |= 8;
                    } else {
                        if (iDecodeElementIndex != 4) {
                            throw new UnknownFieldException(iDecodeElementIndex);
                        }
                        aVar2 = (com.bilibili.ogv.secondary.api.a) compositeDecoderBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 4, a.C0456a.f72628a, aVar2);
                        i7 |= 16;
                    }
                }
                String str4 = str3;
                aVar = aVar2;
                str = str4;
            }
            compositeDecoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
            return new c(i7, list, map, zBooleanValue, str, aVar);
        }

        @NotNull
        public final SerialDescriptor getDescriptor() {
            return f72642b;
        }

        public final void serialize(Encoder encoder, Object obj) {
            c cVar = (c) obj;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f72642b;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
            b bVar = c.Companion;
            boolean zShouldEncodeElementDefault = compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 0);
            Lazy<KSerializer<Object>>[] lazyArr = c.f72635f;
            if (zShouldEncodeElementDefault || !Intrinsics.areEqual(cVar.f72636a, CollectionsKt.emptyList())) {
                compositeEncoderBeginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 0, (SerializationStrategy) lazyArr[0].getValue(), cVar.f72636a);
            }
            compositeEncoderBeginStructure.encodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 1, (SerializationStrategy) lazyArr[1].getValue(), cVar.f72637b);
            compositeEncoderBeginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 2, C8595a.f127260a, Boolean.valueOf(cVar.f72638c));
            boolean zShouldEncodeElementDefault2 = compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 3);
            String str = cVar.f72639d;
            if (zShouldEncodeElementDefault2 || str != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 3, StringSerializer.INSTANCE, str);
            }
            boolean zShouldEncodeElementDefault3 = compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 4);
            com.bilibili.ogv.secondary.api.a aVar = cVar.f72640e;
            if (zShouldEncodeElementDefault3 || aVar != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 4, a.C0456a.f72628a, aVar);
            }
            compositeEncoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
        }

        @NotNull
        public final /* bridge */ KSerializer<?>[] typeParametersSerializers() {
            return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/secondary/api/c$b.class */
    public static final class b {
        @NotNull
        public final KSerializer<c> serializer() {
            return a.f72641a;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f72635f = new Lazy[]{LazyKt.lazy(lazyThreadSafetyMode, new C1939o(8)), LazyKt.lazy(lazyThreadSafetyMode, new C1941p(7)), null, null, null};
    }

    public c(int i7, List list, Map map, boolean z6, String str, com.bilibili.ogv.secondary.api.a aVar) {
        if (6 != (i7 & 6)) {
            PluginExceptionsKt.throwMissingFieldException(i7, 6, a.f72642b);
        }
        this.f72636a = (i7 & 1) == 0 ? CollectionsKt.emptyList() : list;
        this.f72637b = map;
        this.f72638c = z6;
        if ((i7 & 8) == 0) {
            this.f72639d = null;
        } else {
            this.f72639d = str;
        }
        if ((i7 & 16) == 0) {
            this.f72640e = null;
        } else {
            this.f72640e = aVar;
        }
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.areEqual(this.f72636a, cVar.f72636a) && Intrinsics.areEqual(this.f72637b, cVar.f72637b) && this.f72638c == cVar.f72638c && Intrinsics.areEqual(this.f72639d, cVar.f72639d) && Intrinsics.areEqual(this.f72640e, cVar.f72640e);
    }

    public final int hashCode() {
        int iHashCode = this.f72636a.hashCode();
        Map<String, String> map = this.f72637b;
        int iHashCode2 = 0;
        int iA = z.a(((iHashCode * 31) + (map == null ? 0 : map.hashCode())) * 31, 31, this.f72638c);
        String str = this.f72639d;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        com.bilibili.ogv.secondary.api.a aVar = this.f72640e;
        if (aVar != null) {
            iHashCode2 = aVar.hashCode();
        }
        return ((iA + iHashCode3) * 31) + iHashCode2;
    }

    @NotNull
    public final String toString() {
        return "PartData(modules=" + this.f72636a + ", report=" + this.f72637b + ", has_next=" + this.f72638c + ", next_cursor=" + this.f72639d + ", feed=" + this.f72640e + ")";
    }
}
