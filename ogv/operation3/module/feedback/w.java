package com.bilibili.ogv.operation3.module.feedback;

import I.E;
import J3.K1;
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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation3/module/feedback/w.class */
@StabilityInferred(parameters = 0)
@Serializable
public final class w {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final Lazy<KSerializer<Object>>[] f71254e = {null, null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new K1(8))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f71255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f71256b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f71257c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final List<m> f71258d;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation3/module/feedback/w$a.class */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    @StabilityInferred(parameters = 0)
    public static final /* synthetic */ class a implements GeneratedSerializer<w> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f71259a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final PluginGeneratedSerialDescriptor f71260b;

        /* JADX WARN: Type inference failed for: r0v0, types: [com.bilibili.ogv.operation3.module.feedback.w$a, java.lang.Object, kotlinx.serialization.internal.GeneratedSerializer] */
        static {
            ?? obj = new Object();
            f71259a = obj;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.bilibili.ogv.operation3.module.feedback.FeedbackTypeBean", (GeneratedSerializer) obj, 4);
            pluginGeneratedSerialDescriptor.addElement("type", false);
            pluginGeneratedSerialDescriptor.addElement("title", false);
            pluginGeneratedSerialDescriptor.addElement("desc", false);
            pluginGeneratedSerialDescriptor.addElement("list", false);
            f71260b = pluginGeneratedSerialDescriptor;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public final KSerializer<?>[] childSerializers() {
            Lazy<KSerializer<Object>>[] lazyArr = w.f71254e;
            IntSerializer intSerializer = IntSerializer.INSTANCE;
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            return new KSerializer[]{intSerializer, stringSerializer, stringSerializer, lazyArr[3].getValue()};
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
        public final Object deserialize(Decoder decoder) throws UnknownFieldException {
            String strDecodeStringElement;
            String strDecodeStringElement2;
            List list;
            int i7;
            int iDecodeIntElement;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f71260b;
            CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
            Lazy<KSerializer<Object>>[] lazyArr = w.f71254e;
            if (compositeDecoderBeginStructure.decodeSequentially()) {
                iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(pluginGeneratedSerialDescriptor, 0);
                strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 1);
                i7 = 15;
                strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 2);
                list = (List) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 3, (DeserializationStrategy) lazyArr[3].getValue(), (Object) null);
            } else {
                boolean z6 = true;
                int iDecodeIntElement2 = 0;
                strDecodeStringElement = null;
                strDecodeStringElement2 = null;
                list = null;
                int i8 = 0;
                while (z6) {
                    int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                    if (iDecodeElementIndex == -1) {
                        z6 = false;
                    } else if (iDecodeElementIndex == 0) {
                        iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(pluginGeneratedSerialDescriptor, 0);
                        i8 |= 1;
                    } else if (iDecodeElementIndex == 1) {
                        strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 1);
                        i8 |= 2;
                    } else if (iDecodeElementIndex == 2) {
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 2);
                        i8 |= 4;
                    } else {
                        if (iDecodeElementIndex != 3) {
                            throw new UnknownFieldException(iDecodeElementIndex);
                        }
                        list = (List) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 3, (DeserializationStrategy) lazyArr[3].getValue(), list);
                        i8 |= 8;
                    }
                }
                int i9 = iDecodeIntElement2;
                i7 = i8;
                iDecodeIntElement = i9;
            }
            compositeDecoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
            return new w(i7, iDecodeIntElement, strDecodeStringElement, strDecodeStringElement2, list);
        }

        @NotNull
        public final SerialDescriptor getDescriptor() {
            return f71260b;
        }

        public final void serialize(Encoder encoder, Object obj) {
            w wVar = (w) obj;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f71260b;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
            compositeEncoderBeginStructure.encodeIntElement(pluginGeneratedSerialDescriptor, 0, wVar.f71255a);
            compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 1, wVar.f71256b);
            compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 2, wVar.f71257c);
            compositeEncoderBeginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 3, (SerializationStrategy) w.f71254e[3].getValue(), wVar.f71258d);
            compositeEncoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
        }

        @NotNull
        public final /* bridge */ KSerializer<?>[] typeParametersSerializers() {
            return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation3/module/feedback/w$b.class */
    public static final class b {
        @NotNull
        public final KSerializer<w> serializer() {
            return a.f71259a;
        }
    }

    public w(int i7, int i8, String str, String str2, List list) {
        if (15 != (i7 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i7, 15, a.f71260b);
        }
        this.f71255a = i8;
        this.f71256b = str;
        this.f71257c = str2;
        this.f71258d = list;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return this.f71255a == wVar.f71255a && Intrinsics.areEqual(this.f71256b, wVar.f71256b) && Intrinsics.areEqual(this.f71257c, wVar.f71257c) && Intrinsics.areEqual(this.f71258d, wVar.f71258d);
    }

    public final int hashCode() {
        return this.f71258d.hashCode() + E.a(E.a(Integer.hashCode(this.f71255a) * 31, 31, this.f71256b), 31, this.f71257c);
    }

    @NotNull
    public final String toString() {
        List<m> list = this.f71258d;
        StringBuilder sb = new StringBuilder("FeedbackTypeBean(type=");
        sb.append(this.f71255a);
        sb.append(", title=");
        sb.append(this.f71256b);
        sb.append(", desc=");
        return N1.o.a(this.f71257c, ", list=", ")", sb, list);
    }
}
