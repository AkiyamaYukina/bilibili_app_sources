package com.bilibili.ogv.operation3.module.feedback;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
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
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation3/module/feedback/x.class */
@StabilityInferred(parameters = 0)
@Serializable
public final class x {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final Lazy<KSerializer<Object>>[] f71261b = {LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Ab0.a(8))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final List<w> f71262a;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation3/module/feedback/x$a.class */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    @StabilityInferred(parameters = 0)
    public static final /* synthetic */ class a implements GeneratedSerializer<x> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f71263a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final PluginGeneratedSerialDescriptor f71264b;

        /* JADX WARN: Type inference failed for: r0v0, types: [com.bilibili.ogv.operation3.module.feedback.x$a, java.lang.Object, kotlinx.serialization.internal.GeneratedSerializer] */
        static {
            ?? obj = new Object();
            f71263a = obj;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.bilibili.ogv.operation3.module.feedback.FeedbackTypeList", (GeneratedSerializer) obj, 1);
            pluginGeneratedSerialDescriptor.addElement("list", false);
            f71264b = pluginGeneratedSerialDescriptor;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public final KSerializer<?>[] childSerializers() {
            return new KSerializer[]{x.f71261b[0].getValue()};
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
        public final Object deserialize(Decoder decoder) throws UnknownFieldException {
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f71264b;
            CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
            Lazy<KSerializer<Object>>[] lazyArr = x.f71261b;
            int i7 = 1;
            List list = null;
            if (compositeDecoderBeginStructure.decodeSequentially()) {
                list = (List) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 0, (DeserializationStrategy) lazyArr[0].getValue(), (Object) null);
            } else {
                boolean z6 = true;
                i7 = 0;
                while (z6) {
                    int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                    if (iDecodeElementIndex == -1) {
                        z6 = false;
                    } else {
                        if (iDecodeElementIndex != 0) {
                            throw new UnknownFieldException(iDecodeElementIndex);
                        }
                        list = (List) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 0, (DeserializationStrategy) lazyArr[0].getValue(), list);
                        i7 = 1;
                    }
                }
            }
            compositeDecoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
            return new x(i7, list);
        }

        @NotNull
        public final SerialDescriptor getDescriptor() {
            return f71264b;
        }

        public final void serialize(Encoder encoder, Object obj) {
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f71264b;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
            compositeEncoderBeginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 0, (SerializationStrategy) x.f71261b[0].getValue(), ((x) obj).f71262a);
            compositeEncoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
        }

        @NotNull
        public final /* bridge */ KSerializer<?>[] typeParametersSerializers() {
            return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation3/module/feedback/x$b.class */
    public static final class b {
        @NotNull
        public final KSerializer<x> serializer() {
            return a.f71263a;
        }
    }

    public x(int i7, List list) {
        if (1 != (i7 & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i7, 1, a.f71264b);
        }
        this.f71262a = list;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x) && Intrinsics.areEqual(this.f71262a, ((x) obj).f71262a);
    }

    public final int hashCode() {
        return this.f71262a.hashCode();
    }

    @NotNull
    public final String toString() {
        return com.bapis.bilibili.account.interfaces.v1.k.a("FeedbackTypeList(list=", ")", this.f71262a);
    }
}
