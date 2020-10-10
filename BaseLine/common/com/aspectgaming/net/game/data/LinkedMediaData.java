// Generated by http://code.google.com/p/protostuff/ ... DO NOT EDIT!
// Generated from GameProtocol.proto

package com.aspectgaming.net.game.data;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import io.protostuff.GraphIOUtil;
import io.protostuff.Input;
import io.protostuff.Message;
import io.protostuff.Output;
import io.protostuff.Schema;

public final class LinkedMediaData implements Externalizable, Message<LinkedMediaData>, Schema<LinkedMediaData> {

    public static Schema<LinkedMediaData> getSchema() {
        return DEFAULT_INSTANCE;
    }

    public static LinkedMediaData getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    static final LinkedMediaData DEFAULT_INSTANCE = new LinkedMediaData();

    public boolean Enabled;
    public String Type;
    public int Location;
    public String BroadcastIP;
    public int BroadcastPort;
    public int CommandPort;
    public int NumberOfMachines;
    public int ScreenDistance;

    public LinkedMediaData() {}

    @Override
    public String toString() {
        return "LinkedMediaData{" +
                    "enabled=" + Enabled +
                    ", type=" + Type +
                    ", location=" + Location +
                    ", broadcastIP=" + BroadcastIP +
                    ", broadcastPort=" + BroadcastPort +
                    ", commandPort=" + CommandPort +
                    ", numberOfMachines=" + NumberOfMachines +
                    ", screenDistance=" + ScreenDistance +
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

    public Schema<LinkedMediaData> cachedSchema() {
        return DEFAULT_INSTANCE;
    }

    // schema methods

    public LinkedMediaData newMessage() {
        return new LinkedMediaData();
    }

    public Class<LinkedMediaData> typeClass() {
        return LinkedMediaData.class;
    }

    public String messageName() {
        return LinkedMediaData.class.getSimpleName();
    }

    public String messageFullName() {
        return LinkedMediaData.class.getName();
    }

    public boolean isInitialized(LinkedMediaData message) {
        return true;
    }

    public void mergeFrom(Input input, LinkedMediaData message) throws IOException {
        for (int number = input.readFieldNumber(this);; number = input.readFieldNumber(this)) {
            switch (number) {
            case 0:
                return;
            case 1:
                message.Enabled = input.readBool();
                break;
            case 2:
                message.Type = input.readString();
                break;
            case 3:
                message.Location = input.readInt32();
                break;
            case 4:
                message.BroadcastIP = input.readString();
                break;
            case 5:
                message.BroadcastPort = input.readInt32();
                break;
            case 6:
                message.CommandPort = input.readInt32();
                break;
            case 7:
                message.NumberOfMachines = input.readInt32();
                break;
            case 8:
                message.ScreenDistance = input.readInt32();
                break;
            default:
                input.handleUnknownField(number, this);
            }
        }
    }

    public void writeTo(Output output, LinkedMediaData message) throws IOException {
        if (message.Enabled) output.writeBool(1, message.Enabled, false);

        if (message.Type != null) output.writeString(2, message.Type, false);

        if (message.Location != 0) output.writeInt32(3, message.Location, false);

        if (message.BroadcastIP != null) output.writeString(4, message.BroadcastIP, false);

        if (message.BroadcastPort != 0) output.writeInt32(5, message.BroadcastPort, false);

        if (message.CommandPort != 0) output.writeInt32(6, message.CommandPort, false);

        if (message.NumberOfMachines != 0) output.writeInt32(7, message.NumberOfMachines, false);

        if (message.ScreenDistance != 0) output.writeInt32(8, message.ScreenDistance, false);
    }

    public String getFieldName(int number) {
        return Integer.toString(number);
    }

    public int getFieldNumber(String name) {
        return Integer.parseInt(name);
    }

}
