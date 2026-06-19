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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/secondary/api/j.class */
@StabilityInferred(parameters = 1)
@Serializable
public final class j extends h {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f72654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f72655b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f72656c;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/secondary/api/j$a.class */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    @StabilityInferred(parameters = 0)
    public static final /* synthetic */ class a implements GeneratedSerializer<j> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f72657a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final PluginGeneratedSerialDescriptor f72658b;

        /* JADX WARN: Type inference failed for: r0v0, types: [com.bilibili.ogv.secondary.api.j$a, java.lang.Object, kotlinx.serialization.internal.GeneratedSerializer] */
        static {
            ?? obj = new Object();
            f72657a = obj;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.bilibili.ogv.secondary.api.WebTabData", (GeneratedSerializer) obj, 3);
            pluginGeneratedSerialDescriptor.addElement("id", true);
            pluginGeneratedSerialDescriptor.addElement("title", true);
            pluginGeneratedSerialDescriptor.addElement("link", true);
            f72658b = pluginGeneratedSerialDescriptor;
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
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f72658b;
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
            return new j(i7, jDecodeLongElement, strDecodeStringElement, strDecodeStringElement2);
        }

        @NotNull
        public final SerialDescriptor getDescriptor() {
            return f72658b;
        }

        public final void serialize(Encoder encoder, Object obj) {
            j jVar = (j) obj;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f72658b;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
            b bVar = j.Companion;
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 0) || jVar.f72654a != 0) {
                compositeEncoderBeginStructure.encodeLongElement(pluginGeneratedSerialDescriptor, 0, jVar.f72654a);
            }
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 1) || !Intrinsics.areEqual(jVar.f72655b, "")) {
                compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 1, jVar.f72655b);
            }
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 2) || !Intrinsics.areEqual(jVar.f72656c, "")) {
                compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 2, jVar.f72656c);
            }
            compositeEncoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
        }

        @NotNull
        public final /* bridge */ KSerializer<?>[] typeParametersSerializers() {
            return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/secondary/api/j$b.class */
    public static final class b {
        @NotNull
        public final KSerializer<j> serializer() {
            return a.f72657a;
        }
    }

    public j() {
        this.f72654a = 0L;
        this.f72655b = "";
        this.f72656c = "";
    }

    public j(int i7, long j7, String str, String str2) {
        this.f72654a = (i7 & 1) == 0 ? 0L : j7;
        if ((i7 & 2) == 0) {
            this.f72655b = "";
        } else {
            this.f72655b = str;
        }
        if ((i7 & 4) == 0) {
            this.f72656c = "";
        } else {
            this.f72656c = str2;
        }
    }

    @Override // com.bilibili.ogv.secondary.api.h
    public final long a() {
        return this.f72654a;
    }

    @Override // com.bilibili.ogv.secondary.api.h
    @NotNull
    public final String b() {
        return this.f72656c;
    }

    @Override // com.bilibili.ogv.secondary.api.h
    @NotNull
    public final String c() {
        return this.f72655b;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f72654a == jVar.f72654a && Intrinsics.areEqual(this.f72655b, jVar.f72655b) && Intrinsics.areEqual(this.f72656c, jVar.f72656c);
    }

    public final int hashCode() {
        return this.f72656c.hashCode() + E.a(Long.hashCode(this.f72654a) * 31, 31, this.f72655b);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("WebTabData(id=");
        sb.append(this.f72654a);
        sb.append(", title=");
        sb.append(this.f72655b);
        sb.append(", link=");
        return C8770a.a(sb, this.f72656c, ")");
    }
}
