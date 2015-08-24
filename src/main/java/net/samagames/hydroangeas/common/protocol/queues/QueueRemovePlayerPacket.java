package net.samagames.hydroangeas.common.protocol.queues;

import net.samagames.hydroangeas.server.waitingqueue.QPlayer;

/**
 * This file is a part of the SamaGames Project CodeBase
 * This code is absolutely confidential.
 * Created by Geekpower14 on 24/08/2015.
 * (C) Copyright Elydra Network 2014 & 2015
 * All rights reserved.
 */
public class QueueRemovePlayerPacket extends QueuePacket {

    private QPlayer player;

    public QueueRemovePlayerPacket()
    {
    }

    public QueueRemovePlayerPacket(QPlayer player)
    {
        this.player = player;
    }

    public QPlayer getPlayer() {
        return player;
    }

}
