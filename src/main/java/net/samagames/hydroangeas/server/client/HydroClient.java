package net.samagames.hydroangeas.server.client;

import net.samagames.hydroangeas.common.informations.MinecraftServerInfos;
import net.samagames.hydroangeas.common.protocol.HelloFromClientPacket;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * This file is a part of the SamaGames Project CodeBase
 * This code is absolutely confidential.
 * Created by Geekpower14 on 25/06/2015.
 * (C) Copyright Elydra Network 2014 & 2015
 * All rights reserved.
 */
public class HydroClient {

    private UUID uuid;
    private String ip;
    private int maxWeight;
    private int actualWeight;
    private Timestamp timestamp;

    private List<MinecraftServerInfos> serverInfos = new ArrayList<>();

    public HydroClient(UUID uuid, String ip, int maxWeight, int actualWeight, List<MinecraftServerInfos> serverInfos)
    {
        this.uuid = uuid;
        this.ip = ip;

        this.maxWeight = maxWeight;
        // TODO: Actual Weight calc
        this.actualWeight = actualWeight;

        this.timestamp = new Timestamp(System.currentTimeMillis());

        this.serverInfos.addAll(serverInfos);
    }

    public void updateData(HelloFromClientPacket packet)
    {
        if(uuid == null)
            this.uuid = packet.getUUID();

        setIp(packet.getIp());

        setMaxWeight(this.maxWeight = packet.getMaxWeight());

        setActualWeight(packet.getActualWeight());

        this.timestamp = new Timestamp(System.currentTimeMillis());

        //Todo server manager
        this.serverInfos.clear();
        this.serverInfos.addAll(serverInfos);
    }

    public UUID getUUID()
    {
        return this.uuid;
    }

    public String getIp()
    {
        return this.ip;
    }

    public void setIp(String ip)
    {
        this.ip = ip;
    }

    public int getMaxWeight()
    {
        return this.maxWeight;
    }

    public void setMaxWeight(int maxWeight)
    {
        this.maxWeight = maxWeight;
    }

    public int getActualWeight()
    {
        return this.actualWeight;
    }

    public void setActualWeight(int actualWeight)
    {
        // TODO: Actual Weight calc
        this.actualWeight = actualWeight;
    }

    public Timestamp getTimestamp()
    {
        return this.timestamp;
    }

    public void setTimestamp(Timestamp timestamp)
    {
        this.timestamp = timestamp;
    }

    public List<MinecraftServerInfos> getServersInfos()
    {
        return this.serverInfos;
    }




}