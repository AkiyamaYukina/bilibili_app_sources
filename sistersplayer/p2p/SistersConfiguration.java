package com.bilibili.sistersplayer.p2p;

import android.text.TextUtils;
import androidx.core.app.NotificationManagerCompat;
import com.bilibili.mobile.BLHumanActionParamsType;
import com.bilibili.opd.app.bizcommon.context.KFCFragmentLoaderActivity;
import com.bilibili.sistersplayer.httpserver.SimpleBaseClient;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/SistersConfiguration.class */
public class SistersConfiguration {
    public final int ProtocolVersion = 10;
    public ArrayList<String> stunServers = new ArrayList<>();
    public ArrayList<String> trackerServers = new ArrayList<>();
    public ArrayList<String> nat6CheckStunServers = new ArrayList<>();
    public ArrayList<String> nat6FilteringCheckServers = new ArrayList<>();
    public ArrayList<String> natCheckStunServers = new ArrayList<>();
    public ArrayList<String> natFilteringCheckServers = new ArrayList<>();
    public int natKakushinTimeoutMs = 900000;
    public IntRange natKakushinTimeoutMsAllowedRange = new IntRange(0, 604800000);
    public ClosedFloatingPointRange p2pBufferLengthSecAllowedRange = RangesKt.rangeTo(0.0f, 8.0f);
    public float p2pBufferLengthSec = 2.5f;
    public int trackerPeerListWaitTimeMs = KFCFragmentLoaderActivity.REQ_CODE_LOGIN;
    public ArrayList<String> allowedChangeBooleanValues = new ArrayList<>();
    public IntRange iceCandidatePoolSizeAllowedRange = new IntRange(0, 10);
    public int iceCandidatePoolSize = 0;
    public IntRange serverTimeoutMsAllowedRange = new IntRange(1000, KFCFragmentLoaderActivity.REQ_CODE_LOGIN);
    public int serverTimeoutMs = 3000;
    public int peerConnectionTimeoutMs = 5000;
    public IntRange peerTimeoutMsAllowedRange = new IntRange(1000, KFCFragmentLoaderActivity.REQ_CODE_LOGIN);
    public int peerTimeoutMs = 3000;
    public IntRange uploadMaxWaitTimeoutMsAllowedRange = new IntRange(1000, KFCFragmentLoaderActivity.REQ_CODE_LOGIN);
    public int uploadMaxWaitTimeoutMs = 2700;
    public IntRange refreshPeerProgressIntervalMsAllowedRange = new IntRange(100, 1000);
    public int refreshPeerProgressIntervalMs = 200;
    public int sliceCount = 4;
    public int blockSize = 61440;
    public IntRange inConnectingLimitAllowedRange = new IntRange(1, 64);
    public int inConnectingLimit = 4;
    public IntRange outConnectingLimitAllowedRange = new IntRange(1, 64);
    public int outConnectingLimit = 4;
    public IntRange connectedLimitAllowedRange = new IntRange(1, 64);
    public int connectedLimit = 12;
    public IntRange leechConnectNumAllowedRange = new IntRange(1, 64);
    public int leechConnectNum = 4;
    public IntRange seedboxConnectNumBySliceIdAllowedRange = new IntRange(1, 64);
    public int seedboxConnectNumBySliceId = 1;
    public IntRange revisibleMarkAllowedRange = new IntRange(1, 64);
    public int revisibleMark = 8;
    public IntRange reconnectWaitTimeSecAllowedRange = new IntRange(0, 120);
    public int reconnectWaitTimeSec = 10;
    public IntRange fragmentCountOutdatedAllowedRange = new IntRange(2, 120);
    public int fragmentCountOutdated = 8;
    public ClosedFloatingPointRange fragmentShareOverrideAllowedRange = RangesKt.rangeTo(0.0f, 100.0f);
    public float fragmentShareOverride = 1.0f;
    public IntRange fragmentShareOverrideMaxBytesAllowedRange = new IntRange(0, 10000000);
    public int fragmentShareOverrideMaxBytes = 1250000;
    public ClosedFloatingPointRange fragmentExtraShareRatioAllowedRange = RangesKt.rangeTo(0.0f, 50.0f);
    public float fragmentExtraShareRatio = this.fragmentShareOverride / 2.0f;
    public IntRange totalDownloadInstancesAllowedRange = new IntRange(2, 48);
    public int totalDownloadInstances = (int) (((double) this.connectedLimit) * 1.5d);
    public int minDownloadInstancesPerPeer = 1;
    public IntRange maxDownloadInstancesPerPeerAllowedRange = new IntRange(1, 32);
    public int maxDownloadInstancesPerPeer = 4;
    public IntRange fetchCDNTimeoutMsAllowedRange = new IntRange(BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_PREPROCESS_MAX_SIZE, 60000);
    public int fetchCDNTimeoutMs = 7000;
    public int failbackFetchCDNTimeoutMs = 7000;
    public boolean crcVerifyEnable = true;
    public IntRange p2pSafeBufferDurationForDelayStopMsAllowedRange = new IntRange(0, SimpleBaseClient.SO_TIMEOUT);
    public int p2pSafeBufferDurationForDelayStopMs = 3000;
    public IntRange p2pDelayStopMaxMsAllowedRange = new IntRange(0, SimpleBaseClient.SO_TIMEOUT);
    public int p2pDelayStopMaxMs = 300;
    public IntRange p2pFetchDataObCycleCountAllowedRange = new IntRange(1, 32);
    public int p2pFetchDataObCycleCount = 4;
    public IntRange p2pShareDataObCycleCountAllowedRange = new IntRange(1, 32);
    public int p2pShareDataObCycleCount = 3;
    public IntRange p2pSliceIdControlFetchCheckIntervalMsAllowedRange = new IntRange(2000, 30000);
    public int p2pSliceIdControlFetchCheckIntervalMs = 4000;
    public IntRange p2pSliceIdControlShareCheckIntervalMsAllowedRange = new IntRange(2000, 30000);
    public int p2pSliceIdControlShareCheckIntervalMs = 3000;
    public ClosedFloatingPointRange p2pFetchLowestRatioAllowedRange = RangesKt.rangeTo(0.2f, 1.0f);
    public float p2pFetchLowestRatio = 0.6f;
    public ClosedFloatingPointRange p2pShareLargestAllowedFetchRatioAllowedRange = RangesKt.rangeTo(0.2f, 1.0f);
    public float p2pShareLargestAllowedFetchRatio = 0.8f;
    public ClosedFloatingPointRange p2pShareLowestRatioAllowedRange = RangesKt.rangeTo(0.2f, 1.0f);
    public float p2pShareLowestRatio = 0.6f;
    public ClosedFloatingPointRange p2pAddSliceProbabilityAllowedRange = RangesKt.rangeTo(0.0f, 1.0f);
    public float p2pAddSliceProbability = 0.25f;
    public ClosedFloatingPointRange p2pDeleteSliceProbabilityAllowedRange = RangesKt.rangeTo(0.0f, 1.0f);
    public float p2pDeleteSliceProbability = 0.33f;
    public ClosedFloatingPointRange reportPeerSuccessProbabilityAllowedRange = RangesKt.f();
    public float reportPeerSuccessProbability = 1.0f;
    public ClosedFloatingPointRange reportPeerFailedProbabilityAllowedRange = RangesKt.f();
    public float reportPeerFailedProbability = 0.05f;
    public boolean p2pTransferSecondhandDataEnable = true;
    public boolean useSeedBox = false;
    public IntRange seedBoxScoreMaxAllowedRange = new IntRange(100, 1000);
    public int seedBoxScoreMax = 200;
    public IntRange seedScoreUpAllowedRange = new IntRange(NotificationManagerCompat.IMPORTANCE_UNSPECIFIED, 20);
    public int seedScoreUp = 1;
    public IntRange seedScoreDownAllowedRange = new IntRange(0, 1000);
    public int seedScoreDown = 12;
    public IntRange seedAndLackedMaxInstanceAllowedRange = new IntRange(0, 11);
    public int seedAndLackedMaxInstance = 3;
    public IntRange lackedMaxInstanceAllowedRange = new IntRange(0, 11);
    public int lackedMaxInstance = 2;
    public IntRange candidateWaitMaxTimeMsAllowedRange = new IntRange(0, 30000);
    public int candidateWaitMaxTimeMs = 150;
    public IntRange maxDistanceAllowedRange = new IntRange(0, 16);
    public int maxDistance = 1;
    public boolean enableReverseOrder = false;
    public boolean enableHideOwner = true;
    private final HashMap<String, Field> sFields = new HashMap<>();

    public SistersConfiguration() {
        this.stunServers.add("stun:stun.chat.bilibili.com:3478");
        this.stunServers.add("stun:stun6.chat.bilibili.com:3478");
        this.trackerServers.add("wss://tracker.chat.bilibili.com/");
        this.allowedChangeBooleanValues.add("p2pTransferSecondhandDataEnable");
        this.allowedChangeBooleanValues.add("useSeedBox");
        this.allowedChangeBooleanValues.add("enableReverseOrder");
        this.allowedChangeBooleanValues.add("enableHideOwner");
        this.allowedChangeBooleanValues.add("usedCellularCheck");
        loadFields();
    }

    private void loadFields() {
        if (this.sFields.isEmpty()) {
            synchronized (this.sFields) {
                if (this.sFields.isEmpty()) {
                    for (Field field : SistersConfiguration.class.getDeclaredFields()) {
                        this.sFields.put(field.getName(), field);
                    }
                }
            }
        }
    }

    public <T> T getField(String str) {
        Field field;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (this.sFields) {
            field = this.sFields.get(str);
        }
        if (field == null) {
            return null;
        }
        try {
            return (T) field.get(this);
        } catch (Exception e7) {
            return null;
        }
    }

    public Object getFieldObj(String str) {
        Field field;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (this.sFields) {
            field = this.sFields.get(str);
        }
        if (field == null) {
            return null;
        }
        try {
            return field.get(this);
        } catch (Exception e7) {
            return null;
        }
    }

    public <T> boolean setField(String str, T t7) {
        Field field;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        synchronized (this.sFields) {
            field = this.sFields.get(str);
        }
        if (field == null) {
            return false;
        }
        field.setAccessible(true);
        try {
            field.set(this, t7);
            return true;
        } catch (Exception e7) {
            e7.printStackTrace();
            return false;
        }
    }
}
