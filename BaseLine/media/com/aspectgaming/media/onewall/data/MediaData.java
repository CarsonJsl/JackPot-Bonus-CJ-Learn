// Generated by http://code.google.com/p/protostuff/ ... DO NOT EDIT!
// Generated from OneWallProtocol.proto

package com.aspectgaming.media.onewall.data;

import javax.annotation.Generated;
import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import io.protostuff.GraphIOUtil;
import io.protostuff.Input;
import io.protostuff.Message;
import io.protostuff.Output;
import io.protostuff.Schema;

@Generated("java_bean")
public final class MediaData implements Externalizable, Message<MediaData>, Schema<MediaData>
{

    public static Schema<MediaData> getSchema()
    {
        return DEFAULT_INSTANCE;
    }

    public static MediaData getDefaultInstance()
    {
        return DEFAULT_INSTANCE;
    }

    static final MediaData DEFAULT_INSTANCE = new MediaData();

    
    private long iD;
    private String iP;
    private long time;
    private int volume;
    private long status;
    private AnimationAct animation;

    public MediaData()
    {

    }

    @Override
    public String toString() {
        return "MediaData{" +
                    "iD=" + iD +
                    ", iP=" + iP +
                    ", time=" + time +
                    ", volume=" + volume +
                    ", status=" + status +
                    ", animation=" + animation +
                '}';
    }
    // getters and setters

    // iD

    public long getID()
    {
        return iD;
    }


    public void setID(long iD)
    {
        this.iD = iD;
    }

    // iP

    public String getIP()
    {
        return iP;
    }


    public void setIP(String iP)
    {
        this.iP = iP;
    }

    // time

    public long getTime()
    {
        return time;
    }


    public void setTime(long time)
    {
        this.time = time;
    }

    // volume

    public int getVolume()
    {
        return volume;
    }


    public void setVolume(int volume)
    {
        this.volume = volume;
    }

    // status

    public long getStatus()
    {
        return status;
    }


    public void setStatus(long status)
    {
        this.status = status;
    }

    // animation

    public AnimationAct getAnimation()
    {
        return animation;
    }


    public void setAnimation(AnimationAct animation)
    {
        this.animation = animation;
    }

    // java serialization

    public void readExternal(ObjectInput in) throws IOException
    {
        GraphIOUtil.mergeDelimitedFrom(in, this, this);
    }

    public void writeExternal(ObjectOutput out) throws IOException
    {
        GraphIOUtil.writeDelimitedTo(out, this, this);
    }

    // message method

    public Schema<MediaData> cachedSchema()
    {
        return DEFAULT_INSTANCE;
    }

    // schema methods

    public MediaData newMessage()
    {
        return new MediaData();
    }

    public Class<MediaData> typeClass()
    {
        return MediaData.class;
    }

    public String messageName()
    {
        return MediaData.class.getSimpleName();
    }

    public String messageFullName()
    {
        return MediaData.class.getName();
    }

    public boolean isInitialized(MediaData message)
    {
        return true;
    }

    public void mergeFrom(Input input, MediaData message) throws IOException
    {
        for(int number = input.readFieldNumber(this);; number = input.readFieldNumber(this))
        {
            switch(number)
            {
                case 0:
                    return;
                case 1:
                    message.iD = input.readInt64();
                    break;
                case 2:
                    message.iP = input.readString();
                    break;
                case 3:
                    message.time = input.readInt64();
                    break;
                case 4:
                    message.volume = input.readInt32();
                    break;
                case 5:
                    message.status = input.readInt64();
                    break;
                case 6:
                    message.animation = input.mergeObject(message.animation, AnimationAct.getSchema());
                    break;

                default:
                    input.handleUnknownField(number, this);
            }   
        }
    }


    public void writeTo(Output output, MediaData message) throws IOException
    {
        if(message.iD != 0)
            output.writeInt64(1, message.iD, false);

        if(message.iP != null)
            output.writeString(2, message.iP, false);

        if(message.time != 0)
            output.writeInt64(3, message.time, false);

        if(message.volume != 0)
            output.writeInt32(4, message.volume, false);

        if(message.status != 0)
            output.writeInt64(5, message.status, false);

        if(message.animation != null)
             output.writeObject(6, message.animation, AnimationAct.getSchema(), false);

    }

    public String getFieldName(int number)
    {
        return Integer.toString(number);
    }

    public int getFieldNumber(String name)
    {
        return Integer.parseInt(name);
    }
    
}
