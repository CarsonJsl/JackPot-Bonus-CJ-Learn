// Generated by http://code.google.com/p/protostuff/ ... DO NOT EDIT!
// Generated from GameProtocol.proto

package com.aspectgaming.net.game.data;

import io.protostuff.GraphIOUtil;
import io.protostuff.Input;
import io.protostuff.Message;
import io.protostuff.Output;
import io.protostuff.Schema;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;
import java.util.List;

import com.aspectgaming.net.ProtoUtil;

public final class CommandData implements Externalizable, Message<CommandData>, Schema<CommandData> {

    public static Schema<CommandData> getSchema() {
        return DEFAULT_INSTANCE;
    }

    public static CommandData getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    static final CommandData DEFAULT_INSTANCE = new CommandData();

    public String Type;
    public String Name;
    public String[] Values;

    public CommandData() {}

    @Override
    public String toString() {
        return "CommandData{" + "type=" + Type + ", name=" + Name + ", values=" + Values + '}';
    }

    // java serialization

    public void readExternal(ObjectInput in) throws IOException {
        GraphIOUtil.mergeDelimitedFrom(in, this, this);
    }

    public void writeExternal(ObjectOutput out) throws IOException {
        GraphIOUtil.writeDelimitedTo(out, this, this);
    }

    // message method

    public Schema<CommandData> cachedSchema() {
        return DEFAULT_INSTANCE;
    }

    // schema methods

    public CommandData newMessage() {
        return new CommandData();
    }

    public Class<CommandData> typeClass() {
        return CommandData.class;
    }

    public String messageName() {
        return CommandData.class.getSimpleName();
    }

    public String messageFullName() {
        return CommandData.class.getName();
    }

    public boolean isInitialized(CommandData message) {
        return true;
    }

    public void mergeFrom(Input input, CommandData message) throws IOException {
        List<String> Values = null;
        try {
            for (int number = input.readFieldNumber(this);; number = input.readFieldNumber(this)) {
                switch (number) {
                case 0:
                    return;
                case 1:
                    message.Type = input.readString();
                    break;
                case 2:
                    message.Name = input.readString();
                    break;
                case 3:
                    if (Values == null) Values = new ArrayList<>();
                    Values.add(input.readString());
                    break;
                default:
                    input.handleUnknownField(number, this);
                }
            }
        } finally {
            message.Values = ProtoUtil.toStringArray(Values);
        }
    }

    public void writeTo(Output output, CommandData message) throws IOException {
        if (message.Type != null) output.writeString(1, message.Type, false);

        if (message.Name != null) output.writeString(2, message.Name, false);

        if (message.Values != null) {
            for (String values : message.Values) {
                if (values != null) output.writeString(3, values, true);
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
