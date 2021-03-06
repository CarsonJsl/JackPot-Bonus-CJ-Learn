// Generated by http://code.google.com/p/protostuff/ ... DO NOT EDIT!
// Generated from GameProtocol.proto

package com.aspectgaming.net.game.data;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;
import java.util.List;

import com.aspectgaming.net.ProtoUtil;

import io.protostuff.GraphIOUtil;
import io.protostuff.Input;
import io.protostuff.Message;
import io.protostuff.Output;
import io.protostuff.Schema;

public final class GambleData implements Externalizable, Message<GambleData>, Schema<GambleData> {

    public static Schema<GambleData> getSchema() {
        return DEFAULT_INSTANCE;
    }

    public static GambleData getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    static final GambleData DEFAULT_INSTANCE = new GambleData();

    public int Round;
    public boolean RiskHalf;
    public long AffordWager;
    public long Wager;
    public int Level;
    public int PlayerPick; // (GambleLevel is 2) 0:black 1:red; (GambleLevel is 4) 0:spade 1:club 2:diamond 3:heart
    public int Result;
    public long Win;
    public long TotalWin;
    public int[] History; // 0:spade 1:club 2:diamond 3:heart

    public GambleData() {}

    @Override
    public String toString() {
        return "GambleData{" +
                    "round=" + Round +
                    ", riskHalf=" + RiskHalf +
                    ", affordWager=" + AffordWager +
                    ", wager=" + Wager +
                    ", level=" + Level +
                    ", playerPick=" + PlayerPick +
                    ", result=" + Result +
                    ", win=" + Win +
                    ", totalWin=" + TotalWin +
                    ", history=" + History +
                '}';
    }

    // java serialization

    public void readExternal(ObjectInput in) throws IOException {
        GraphIOUtil.mergeDelimitedFrom(in, this, this);
    }

    public void writeExternal(ObjectOutput out) throws IOException {
        GraphIOUtil.writeDelimitedTo(out, this, this);
    }

    // message method

    public Schema<GambleData> cachedSchema() {
        return DEFAULT_INSTANCE;
    }

    // schema methods

    public GambleData newMessage() {
        return new GambleData();
    }

    public Class<GambleData> typeClass() {
        return GambleData.class;
    }

    public String messageName() {
        return GambleData.class.getSimpleName();
    }

    public String messageFullName() {
        return GambleData.class.getName();
    }

    public boolean isInitialized(GambleData message) {
        return true;
    }

    public void mergeFrom(Input input, GambleData message) throws IOException {
        List<Integer> History = null;
        try {
            for (int number = input.readFieldNumber(this);; number = input.readFieldNumber(this)) {
                switch (number) {
                case 0:
                    return;
                case 1:
                    message.Round = input.readInt32();
                    break;
                case 2:
                    message.RiskHalf = input.readBool();
                    break;
                case 3:
                    message.AffordWager = input.readInt64();
                    break;
                case 4:
                    message.Wager = input.readInt64();
                    break;
                case 5:
                    message.Level = input.readInt32();
                    break;
                case 6:
                    message.PlayerPick = input.readInt32();
                    break;
                case 7:
                    message.Result = input.readInt32();
                    break;
                case 8:
                    message.Win = input.readInt64();
                    break;
                case 9:
                    message.TotalWin = input.readInt64();
                    break;
                case 10:
                    if (History == null) History = new ArrayList<Integer>();
                    History.add(input.readInt32());
                    break;
                default:
                    input.handleUnknownField(number, this);
                }
            }
        } finally {
            message.History = ProtoUtil.toIntArray(History);
        }
    }

    public void writeTo(Output output, GambleData message) throws IOException {
        if (message.Round != 0) output.writeInt32(1, message.Round, false);

        if (message.RiskHalf) output.writeBool(2, message.RiskHalf, false);

        if (message.AffordWager != 0) output.writeInt64(3, message.AffordWager, false);

        if (message.Wager != 0) output.writeInt64(4, message.Wager, false);

        if (message.Level != 0) output.writeInt32(5, message.Level, false);

        if (message.PlayerPick != 0) output.writeInt32(6, message.PlayerPick, false);

        if (message.Result != 0) output.writeInt32(7, message.Result, false);

        if (message.Win != 0) output.writeInt64(8, message.Win, false);

        if (message.TotalWin != 0) output.writeInt64(9, message.TotalWin, false);

        if (message.History != null) {
            for (Integer history : message.History) {
                if (history != null) output.writeInt32(10, history, true);
            }
        }
    }

    public String getFieldName(int number) {
        return Integer.toString(number);
    }

    public int getFieldNumber(String name) {
        return Integer.parseInt(name);
    }

}
