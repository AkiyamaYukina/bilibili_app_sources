package com.bilibili.ogv.secondary.api;

import I.E;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.UnknownFieldException;
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
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/secondary/api/b.class */
@StabilityInferred(parameters = 1)
@Serializable
public final class b extends h {

    @NotNull
    public static final C0457b Companion = new C0457b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f72630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f72631b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f72632c;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/secondary/api/b$a.class */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    @StabilityInferred(parameters = 0)
    public static final /* synthetic */ class a implements GeneratedSerializer<b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f72633a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final PluginGeneratedSerialDescriptor f72634b;

        /* JADX WARN: Type inference failed for: r0v0, types: [com.bilibili.ogv.secondary.api.b$a, java.lang.Object, kotlinx.serialization.internal.GeneratedSerializer] */
        static {
            ?? obj = new Object();
            f72633a = obj;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.bilibili.ogv.secondary.api.NativeTabData", (GeneratedSerializer) obj, 3);
            pluginGeneratedSerialDescriptor.addElement("id", true);
            pluginGeneratedSerialDescriptor.addElement("title", true);
            pluginGeneratedSerialDescriptor.addElement("link", true);
            f72634b = pluginGeneratedSerialDescriptor;
        }

        @NotNull
        public final KSerializer<?>[] childSerializers() {
            KSerializer<?> kSerializer = LongSerializer.INSTANCE;
            KSerializer<?> kSerializer2 = StringSerializer.INSTANCE;
            return new KSerializer[]{kSerializer, kSerializer2, kSerializer2};
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
        public final Object deserialize(Decoder decoder) throws UnknownFieldException {
            String strDecodeStringElement;
            long jDecodeLongElement;
            String strDecodeStringElement2;
            int i7;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f72634b;
            CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
            if (compositeDecoderBeginStructure.decodeSequentially()) {
                jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(pluginGeneratedSerialDescriptor, 0);
                strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 1);
                strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 2);
                i7 = 7;
            } else {
                strDecodeStringElement = null;
                boolean z6 = true;
                jDecodeLongElement = 0;
                strDecodeStringElement2 = null;
                i7 = 0;
                while (z6) {
                    int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                    if (iDecodeElementIndex == -1) {
                        z6 = false;
                    } else if (iDecodeElementIndex == 0) {
                        jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(pluginGeneratedSerialDescriptor, 0);
                        i7 |= 1;
                    } else if (iDecodeElementIndex == 1) {
                        strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 1);
                        i7 |= 2;
                    } else {
                        if (iDecodeElementIndex != 2) {
                            throw new UnknownFieldException(iDecodeElementIndex);
                        }
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 2);
                        i7 |= 4;
                    }
                }
            }
            compositeDecoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
            return new b(i7, jDecodeLongElement, strDecodeStringElement, strDecodeStringElement2);
        }

        @NotNull
        public final SerialDescriptor getDescriptor() {
            return f72634b;
        }

        public final void serialize(Encoder encoder, Object obj) {
            b bVar = (b) obj;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f72634b;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
            C0457b c0457b = b.Companion;
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 0) || bVar.f72630a != 0) {
                compositeEncoderBeginStructure.encodeLongElement(pluginGeneratedSerialDescriptor, 0, bVar.f72630a);
            }
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 1) || !Intrinsics.areEqual(bVar.f72631b, "")) {
                compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 1, bVar.f72631b);
            }
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 2) || !Intrinsics.areEqual(bVar.f72632c, "")) {
                compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 2, bVar.f72632c);
            }
            compositeEncoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
        }

        @NotNull
        public final /* bridge */ KSerializer<?>[] typeParametersSerializers() {
            return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ogv.secondary.api.b$b, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/secondary/api/b$b.class */
    public static final class C0457b {
        @NotNull
        public final KSerializer<b> serializer() {
            return a.f72633a;
        }
    }

    public b() {
        this.f72630a = 0L;
        this.f72631b = "";
        this.f72632c = "";
    }

    public b(int i7, long j7, String str, String str2) {
        this.f72630a = (i7 & 1) == 0 ? 0L : j7;
        if ((i7 & 2) == 0) {
            this.f72631b = "";
        } else {
            this.f72631b = str;
        }
        if ((i7 & 4) == 0) {
            this.f72632c = "";
        } else {
            this.f72632c = str2;
        }
    }

    @Override // com.bilibili.ogv.secondary.api.h
    public final long a() {
        return this.f72630a;
    }

    @Override // com.bilibili.ogv.secondary.api.h
    @NotNull
    public final String b() {
        return this.f72632c;
    }

    @Override // com.bilibili.ogv.secondary.api.h
    @NotNull
    public final String c() {
        return this.f72631b;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f72630a == bVar.f72630a && Intrinsics.areEqual(this.f72631b, bVar.f72631b) && Intrinsics.areEqual(this.f72632c, bVar.f72632c);
    }

    public final int hashCode() {
        return this.f72632c.hashCode() + E.a(Long.hashCode(this.f72630a) * 31, 31, this.f72631b);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("NativeTabData(id=");
        sb.append(this.f72630a);
        sb.append(", title=");
        sb.append(this.f72631b);
        sb.append(", link=");
        return C8770a.a(sb, this.f72632c, ")");
    }
}
