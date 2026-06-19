package com.bilibili.ogv.kmm.operation.api;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ogv.operation3.module.followable.m;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sj0.C8595a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/api/e.class */
@StabilityInferred(parameters = 1)
@Serializable
public final class e implements m {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f67982a;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/api/e$a.class */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    @StabilityInferred(parameters = 0)
    public static final /* synthetic */ class a implements GeneratedSerializer<e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f67983a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final PluginGeneratedSerialDescriptor f67984b;

        /* JADX WARN: Type inference failed for: r0v0, types: [com.bilibili.ogv.kmm.operation.api.e$a, java.lang.Object, kotlinx.serialization.internal.GeneratedSerializer] */
        static {
            ?? obj = new Object();
            f67983a = obj;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.bilibili.ogv.kmm.operation.api.OperationModuleItemStatus", (GeneratedSerializer) obj, 1);
            pluginGeneratedSerialDescriptor.addElement("follow", true);
            f67984b = pluginGeneratedSerialDescriptor;
        }

        @NotNull
        public final KSerializer<?>[] childSerializers() {
            return new KSerializer[]{C8595a.f127260a};
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
        public final Object deserialize(Decoder decoder) throws UnknownFieldException {
            boolean zBooleanValue;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f67984b;
            CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
            int i7 = 1;
            if (compositeDecoderBeginStructure.decodeSequentially()) {
                zBooleanValue = ((Boolean) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 0, C8595a.f127260a, Boolean.FALSE)).booleanValue();
            } else {
                boolean z6 = true;
                zBooleanValue = false;
                i7 = 0;
                while (z6) {
                    int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                    if (iDecodeElementIndex == -1) {
                        z6 = false;
                    } else {
                        if (iDecodeElementIndex != 0) {
                            throw new UnknownFieldException(iDecodeElementIndex);
                        }
                        zBooleanValue = ((Boolean) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 0, C8595a.f127260a, Boolean.valueOf(zBooleanValue))).booleanValue();
                        i7 = 1;
                    }
                }
            }
            compositeDecoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
            return new e(i7, zBooleanValue);
        }

        @NotNull
        public final SerialDescriptor getDescriptor() {
            return f67984b;
        }

        public final void serialize(Encoder encoder, Object obj) {
            e eVar = (e) obj;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f67984b;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
            b bVar = e.Companion;
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 0) || eVar.f67982a) {
                compositeEncoderBeginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 0, C8595a.f127260a, Boolean.valueOf(eVar.f67982a));
            }
            compositeEncoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
        }

        @NotNull
        public final /* bridge */ KSerializer<?>[] typeParametersSerializers() {
            return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/api/e$b.class */
    public static final class b {
        @NotNull
        public final KSerializer<e> serializer() {
            return a.f67983a;
        }
    }

    public e() {
        this(0);
    }

    public e(int i7) {
        this.f67982a = false;
    }

    public e(int i7, boolean z6) {
        if ((i7 & 1) == 0) {
            this.f67982a = false;
        } else {
            this.f67982a = z6;
        }
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && this.f67982a == ((e) obj).f67982a;
    }

    @Override // com.bilibili.ogv.operation3.module.followable.m
    public final boolean getFollow() {
        return this.f67982a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f67982a);
    }

    @NotNull
    public final String toString() {
        return androidx.appcompat.app.i.a(new StringBuilder("OperationModuleItemStatus(follow="), this.f67982a, ")");
    }
}
