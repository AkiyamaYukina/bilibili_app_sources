package com.bilibili.ogv.kmm.operation.banner;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ogv.kmm.operation.banner.C5437a;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
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

/* JADX INFO: renamed from: com.bilibili.ogv.kmm.operation.banner.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/banner/d.class */
@StabilityInferred(parameters = 0)
@Serializable
public final class C5440d {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f68098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final String f68099b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final C5437a.e f68100c;

    /* JADX INFO: renamed from: com.bilibili.ogv.kmm.operation.banner.d$a */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/banner/d$a.class */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    @StabilityInferred(parameters = 0)
    public static final /* synthetic */ class a implements GeneratedSerializer<C5440d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f68101a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final PluginGeneratedSerialDescriptor f68102b;

        /* JADX WARN: Type inference failed for: r0v0, types: [com.bilibili.ogv.kmm.operation.banner.d$a, java.lang.Object, kotlinx.serialization.internal.GeneratedSerializer] */
        static {
            ?? obj = new Object();
            f68101a = obj;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.bilibili.ogv.kmm.operation.banner.BannerInteractionConfig", (GeneratedSerializer) obj, 3);
            pluginGeneratedSerialDescriptor.addElement("item_id", true);
            pluginGeneratedSerialDescriptor.addElement("url", true);
            pluginGeneratedSerialDescriptor.addElement("modInfo", true);
            f68102b = pluginGeneratedSerialDescriptor;
        }

        @NotNull
        public final KSerializer<?>[] childSerializers() {
            return new KSerializer[]{LongSerializer.INSTANCE, BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE), BuiltinSerializersKt.getNullable(C5437a.e.C0402a.f68096a)};
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
        public final Object deserialize(Decoder decoder) throws UnknownFieldException {
            int i7;
            long jDecodeLongElement;
            C5437a.e eVar;
            String str;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f68102b;
            CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
            String str2 = null;
            if (compositeDecoderBeginStructure.decodeSequentially()) {
                jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(pluginGeneratedSerialDescriptor, 0);
                i7 = 7;
                str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 1, StringSerializer.INSTANCE, (Object) null);
                eVar = (C5437a.e) compositeDecoderBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 2, C5437a.e.C0402a.f68096a, (Object) null);
            } else {
                boolean z6 = true;
                i7 = 0;
                jDecodeLongElement = 0;
                eVar = null;
                while (z6) {
                    int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                    if (iDecodeElementIndex == -1) {
                        z6 = false;
                    } else if (iDecodeElementIndex == 0) {
                        jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(pluginGeneratedSerialDescriptor, 0);
                        i7 |= 1;
                    } else if (iDecodeElementIndex == 1) {
                        str2 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 1, StringSerializer.INSTANCE, str2);
                        i7 |= 2;
                    } else {
                        if (iDecodeElementIndex != 2) {
                            throw new UnknownFieldException(iDecodeElementIndex);
                        }
                        eVar = (C5437a.e) compositeDecoderBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 2, C5437a.e.C0402a.f68096a, eVar);
                        i7 |= 4;
                    }
                }
                str = str2;
            }
            compositeDecoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
            return new C5440d(i7, jDecodeLongElement, str, eVar);
        }

        @NotNull
        public final SerialDescriptor getDescriptor() {
            return f68102b;
        }

        public final void serialize(Encoder encoder, Object obj) {
            C5440d c5440d = (C5440d) obj;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f68102b;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
            b bVar = C5440d.Companion;
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 0) || c5440d.f68098a != 0) {
                compositeEncoderBeginStructure.encodeLongElement(pluginGeneratedSerialDescriptor, 0, c5440d.f68098a);
            }
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 1) || c5440d.f68099b != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 1, StringSerializer.INSTANCE, c5440d.f68099b);
            }
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 2) || c5440d.f68100c != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 2, C5437a.e.C0402a.f68096a, c5440d.f68100c);
            }
            compositeEncoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
        }

        @NotNull
        public final /* bridge */ KSerializer<?>[] typeParametersSerializers() {
            return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ogv.kmm.operation.banner.d$b */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/banner/d$b.class */
    public static final class b {
        @NotNull
        public final KSerializer<C5440d> serializer() {
            return a.f68101a;
        }
    }

    public C5440d() {
        this(0L, null, null);
    }

    public C5440d(int i7, long j7, String str, C5437a.e eVar) {
        this.f68098a = (i7 & 1) == 0 ? 0L : j7;
        if ((i7 & 2) == 0) {
            this.f68099b = null;
        } else {
            this.f68099b = str;
        }
        if ((i7 & 4) == 0) {
            this.f68100c = null;
        } else {
            this.f68100c = eVar;
        }
    }

    public C5440d(long j7, @Nullable String str, @Nullable C5437a.e eVar) {
        this.f68098a = j7;
        this.f68099b = str;
        this.f68100c = eVar;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5440d)) {
            return false;
        }
        C5440d c5440d = (C5440d) obj;
        return this.f68098a == c5440d.f68098a && Intrinsics.areEqual(this.f68099b, c5440d.f68099b) && Intrinsics.areEqual(this.f68100c, c5440d.f68100c);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.f68098a);
        int iHashCode2 = 0;
        String str = this.f68099b;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        C5437a.e eVar = this.f68100c;
        if (eVar != null) {
            iHashCode2 = eVar.hashCode();
        }
        return (((iHashCode * 31) + iHashCode3) * 31) + iHashCode2;
    }

    @NotNull
    public final String toString() {
        return "BannerInteractionConfig(item_id=" + this.f68098a + ", url=" + this.f68099b + ", modInfo=" + this.f68100c + ")";
    }
}
