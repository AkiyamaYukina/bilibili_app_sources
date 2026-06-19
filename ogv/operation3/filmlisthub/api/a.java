package com.bilibili.ogv.operation3.filmlisthub.api;

import J2.g;
import J3.C2378s1;
import J3.C2381t1;
import androidx.compose.animation.z;
import androidx.compose.runtime.internal.StabilityInferred;
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
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sj0.C8595a;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation3/filmlisthub/api/a.class */
@StabilityInferred(parameters = 0)
@Serializable
public final class a {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final Lazy<KSerializer<Object>>[] f71070e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final List<Wk0.e> f71071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Map<String, String> f71072b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f71073c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final String f71074d;

    /* JADX INFO: renamed from: com.bilibili.ogv.operation3.filmlisthub.api.a$a, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation3/filmlisthub/api/a$a.class */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    @StabilityInferred(parameters = 0)
    public static final /* synthetic */ class C0440a implements GeneratedSerializer<a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final C0440a f71075a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final PluginGeneratedSerialDescriptor f71076b;

        /* JADX WARN: Type inference failed for: r0v0, types: [com.bilibili.ogv.operation3.filmlisthub.api.a$a, java.lang.Object, kotlinx.serialization.internal.GeneratedSerializer] */
        static {
            ?? obj = new Object();
            f71075a = obj;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.bilibili.ogv.operation3.filmlisthub.api.FilmListData", (GeneratedSerializer) obj, 4);
            pluginGeneratedSerialDescriptor.addElement("playlist", true);
            pluginGeneratedSerialDescriptor.addElement("report", true);
            pluginGeneratedSerialDescriptor.addElement("has_next", true);
            pluginGeneratedSerialDescriptor.addElement("next_cursor", true);
            f71076b = pluginGeneratedSerialDescriptor;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public final KSerializer<?>[] childSerializers() {
            Lazy<KSerializer<Object>>[] lazyArr = a.f71070e;
            return new KSerializer[]{lazyArr[0].getValue(), lazyArr[1].getValue(), C8595a.f127260a, BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE)};
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
        public final Object deserialize(Decoder decoder) throws UnknownFieldException {
            boolean zBooleanValue;
            Map map;
            int i7;
            List list;
            String str;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f71076b;
            CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
            Lazy<KSerializer<Object>>[] lazyArr = a.f71070e;
            if (compositeDecoderBeginStructure.decodeSequentially()) {
                List list2 = (List) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 0, (DeserializationStrategy) lazyArr[0].getValue(), (Object) null);
                map = (Map) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 1, (DeserializationStrategy) lazyArr[1].getValue(), (Object) null);
                zBooleanValue = ((Boolean) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 2, C8595a.f127260a, Boolean.FALSE)).booleanValue();
                str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 3, StringSerializer.INSTANCE, (Object) null);
                i7 = 15;
                list = list2;
            } else {
                boolean z6 = true;
                zBooleanValue = false;
                List list3 = null;
                map = null;
                String str2 = null;
                i7 = 0;
                while (z6) {
                    int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                    if (iDecodeElementIndex == -1) {
                        z6 = false;
                    } else if (iDecodeElementIndex == 0) {
                        list3 = (List) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 0, (DeserializationStrategy) lazyArr[0].getValue(), list3);
                        i7 |= 1;
                    } else if (iDecodeElementIndex == 1) {
                        map = (Map) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 1, (DeserializationStrategy) lazyArr[1].getValue(), map);
                        i7 |= 2;
                    } else if (iDecodeElementIndex == 2) {
                        zBooleanValue = ((Boolean) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 2, C8595a.f127260a, Boolean.valueOf(zBooleanValue))).booleanValue();
                        i7 |= 4;
                    } else {
                        if (iDecodeElementIndex != 3) {
                            throw new UnknownFieldException(iDecodeElementIndex);
                        }
                        str2 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 3, StringSerializer.INSTANCE, str2);
                        i7 |= 8;
                    }
                }
                list = list3;
                str = str2;
            }
            compositeDecoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
            return new a(i7, str, map, zBooleanValue, list);
        }

        @NotNull
        public final SerialDescriptor getDescriptor() {
            return f71076b;
        }

        public final void serialize(Encoder encoder, Object obj) {
            a aVar = (a) obj;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f71076b;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
            b bVar = a.Companion;
            boolean zShouldEncodeElementDefault = compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 0);
            Lazy<KSerializer<Object>>[] lazyArr = a.f71070e;
            if (zShouldEncodeElementDefault || !Intrinsics.areEqual(aVar.f71071a, CollectionsKt.emptyList())) {
                compositeEncoderBeginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 0, (SerializationStrategy) lazyArr[0].getValue(), aVar.f71071a);
            }
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 1) || !Intrinsics.areEqual(aVar.f71072b, MapsKt.emptyMap())) {
                compositeEncoderBeginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 1, (SerializationStrategy) lazyArr[1].getValue(), aVar.f71072b);
            }
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 2) || aVar.f71073c) {
                compositeEncoderBeginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 2, C8595a.f127260a, Boolean.valueOf(aVar.f71073c));
            }
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 3) || aVar.f71074d != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 3, StringSerializer.INSTANCE, aVar.f71074d);
            }
            compositeEncoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
        }

        @NotNull
        public final /* bridge */ KSerializer<?>[] typeParametersSerializers() {
            return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation3/filmlisthub/api/a$b.class */
    public static final class b {
        @NotNull
        public final KSerializer<a> serializer() {
            return C0440a.f71075a;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f71070e = new Lazy[]{LazyKt.lazy(lazyThreadSafetyMode, new C2378s1(9)), LazyKt.lazy(lazyThreadSafetyMode, new C2381t1(8)), null, null};
    }

    public a() {
        List<Wk0.e> listEmptyList = CollectionsKt.emptyList();
        Map<String, String> mapEmptyMap = MapsKt.emptyMap();
        this.f71071a = listEmptyList;
        this.f71072b = mapEmptyMap;
        this.f71073c = false;
        this.f71074d = null;
    }

    public a(int i7, String str, Map map, boolean z6, List list) {
        this.f71071a = (i7 & 1) == 0 ? CollectionsKt.emptyList() : list;
        this.f71072b = (i7 & 2) == 0 ? MapsKt.emptyMap() : map;
        if ((i7 & 4) == 0) {
            this.f71073c = false;
        } else {
            this.f71073c = z6;
        }
        if ((i7 & 8) == 0) {
            this.f71074d = null;
        } else {
            this.f71074d = str;
        }
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.f71071a, aVar.f71071a) && Intrinsics.areEqual(this.f71072b, aVar.f71072b) && this.f71073c == aVar.f71073c && Intrinsics.areEqual(this.f71074d, aVar.f71074d);
    }

    public final int hashCode() {
        int iA = z.a(g.a(this.f71071a.hashCode() * 31, this.f71072b, 31), 31, this.f71073c);
        String str = this.f71074d;
        return iA + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public final String toString() {
        List<Wk0.e> list = this.f71071a;
        Map<String, String> map = this.f71072b;
        StringBuilder sb = new StringBuilder("FilmListData(playlist=");
        sb.append(list);
        sb.append(", report=");
        sb.append(map);
        sb.append(", has_next=");
        sb.append(this.f71073c);
        sb.append(", next_cursor=");
        return C8770a.a(sb, this.f71074d, ")");
    }
}
