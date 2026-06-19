package com.bilibili.sponge.audio;

import android.media.AudioRecord;
import androidx.annotation.NonNull;
import com.bilibili.sponge.callback.IAudioRawDataListener;
import com.bilibili.studio.videoeditor.nvsstreaming.EditNvsTimelineInfoBase;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/sponge/audio/AudioManageHelper.class */
public class AudioManageHelper {
    private static final String TAG = "AudioManageHelper";
    private int mAudioBufferSize;
    private Thread mAudioCaptureThread;
    private byte[] mAudioData;
    private AudioRecord mAudioRecorder;
    private IAudioRawDataListener mCaptureAudioListener;
    private int minBufferSize;
    private int mSampleRate = EditNvsTimelineInfoBase.DEFAULT_SAMPLE_RATE;
    private int mAudioChannel = 12;
    private int mAudioFormat = 2;
    private int mReadBufferSize = 1024;
    private volatile boolean isRecord = false;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sponge/audio/AudioManageHelper$AudioCaptureThread.class */
    public class AudioCaptureThread extends Thread {
        final AudioManageHelper this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AudioCaptureThread(@NonNull AudioManageHelper audioManageHelper, String str) {
            super(str);
            this.this$0 = audioManageHelper;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            super.run();
            while (this.this$0.isRecord) {
                AudioManageHelper audioManageHelper = this.this$0;
                audioManageHelper.mAudioData = new byte[audioManageHelper.mReadBufferSize];
                int i7 = this.this$0.mAudioRecorder.read(this.this$0.mAudioData, 0, this.this$0.mReadBufferSize);
                if (i7 >= 0) {
                    if (this.this$0.mCaptureAudioListener != null) {
                        AudioManageHelper audioManageHelper2 = this.this$0;
                        this.this$0.mCaptureAudioListener.onCaptureAudio(audioManageHelper2.generateAudioFrame(audioManageHelper2.mAudioData));
                    }
                } else if (i7 == -3) {
                    BLog.e(AudioManageHelper.TAG, "AudioCaptureThread , AudioRecord the object isn't properly initialized ");
                } else if (i7 == -2) {
                    BLog.e(AudioManageHelper.TAG, "AudioCaptureThread , the parameters don't resolve to valid data and indexes");
                } else if (i7 == -6) {
                    BLog.e(AudioManageHelper.TAG, "AudioCaptureThread , AudioRecord.ERROR_DEAD_OBJECT");
                } else if (i7 == -1) {
                    BLog.e(AudioManageHelper.TAG, "AudioCaptureThread , in case of other error");
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public RawAudioFrame generateAudioFrame(byte[] bArr) {
        RawAudioFrame rawAudioFrame = new RawAudioFrame();
        rawAudioFrame.setmSourceType(0);
        rawAudioFrame.setmSampleRate(this.mSampleRate);
        rawAudioFrame.setmChannel(this.mAudioChannel);
        rawAudioFrame.setmAudioFormat(this.mAudioFormat);
        rawAudioFrame.setmRawData(bArr);
        rawAudioFrame.setmSourceType(1);
        return rawAudioFrame;
    }

    public void createAudioRecord() {
        int minBufferSize = AudioRecord.getMinBufferSize(this.mSampleRate, this.mAudioChannel, this.mAudioFormat);
        this.minBufferSize = minBufferSize;
        this.mAudioBufferSize = minBufferSize * 2;
        this.mAudioRecorder = new AudioRecord(1, this.mSampleRate, this.mAudioChannel, this.mAudioFormat, this.mAudioBufferSize);
    }

    public void createAudioRecord(AudioParameterConfig audioParameterConfig) {
        this.mAudioChannel = audioParameterConfig.getAudioChannel();
        this.mSampleRate = audioParameterConfig.getSampleRate();
        this.mAudioFormat = audioParameterConfig.getAudioFormat();
        this.mAudioBufferSize = audioParameterConfig.getBufferSize();
        int minBufferSize = AudioRecord.getMinBufferSize(this.mSampleRate, this.mAudioChannel, this.mAudioFormat);
        this.minBufferSize = minBufferSize;
        if (this.mAudioBufferSize < minBufferSize) {
            this.mAudioBufferSize = minBufferSize;
        }
        this.mReadBufferSize = this.mAudioBufferSize;
        if (audioParameterConfig.getReadBufferSize() > 0) {
            this.mReadBufferSize = audioParameterConfig.getReadBufferSize();
        }
        this.mAudioRecorder = new AudioRecord(1, this.mSampleRate, this.mAudioChannel, this.mAudioFormat, this.mAudioBufferSize);
    }

    public int getMinBufferSize(int i7, int i8, int i9) {
        return AudioRecord.getMinBufferSize(i7, i8, i9);
    }

    public int getmAudioBufferSize() {
        return this.mAudioBufferSize;
    }

    public int getmAudioChannel() {
        return this.mAudioChannel;
    }

    public byte[] getmAudioData() {
        return this.mAudioData;
    }

    public int getmAudioFormat() {
        return this.mAudioFormat;
    }

    public int getmSampleRate() {
        return this.mSampleRate;
    }

    public boolean isRecord() {
        return this.isRecord;
    }

    public void releaseAudioRecord() {
        AudioRecord audioRecord = this.mAudioRecorder;
        if (audioRecord != null) {
            audioRecord.release();
            this.mAudioRecorder = null;
        }
    }

    public void setCaptureAudioListener(IAudioRawDataListener iAudioRawDataListener) {
        this.mCaptureAudioListener = iAudioRawDataListener;
    }

    public void setmAudioChannel(int i7) {
        this.mAudioChannel = i7;
    }

    public void setmAudioFormat(int i7) {
        this.mAudioFormat = i7;
    }

    public void setmSampleRate(int i7) {
        this.mSampleRate = i7;
    }

    public void startRecord() {
        AudioRecord audioRecord = this.mAudioRecorder;
        if (audioRecord != null && audioRecord.getState() == 1) {
            this.isRecord = true;
            this.mAudioRecorder.startRecording();
        }
        if (this.mAudioCaptureThread == null) {
            AudioCaptureThread audioCaptureThread = new AudioCaptureThread(this, "audio-capture-thread");
            this.mAudioCaptureThread = audioCaptureThread;
            audioCaptureThread.start();
        }
    }

    public void stopRecord() {
        this.isRecord = false;
        Thread thread = this.mAudioCaptureThread;
        if (thread != null) {
            try {
                thread.join(2000L);
            } catch (InterruptedException e7) {
                e7.printStackTrace();
            }
            this.mAudioCaptureThread = null;
        }
    }
}
