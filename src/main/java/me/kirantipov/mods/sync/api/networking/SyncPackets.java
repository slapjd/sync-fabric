package me.kirantipov.mods.sync.api.networking;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

public final class SyncPackets {
    public static void init() {
        ServerPlayerPacket.register(SynchronizationRequestPacket.class);
    }

    @Environment(EnvType.CLIENT)
    public static void initClient() {
        ClientPlayerPacket.register(ShellStateUpdatePacket.class);
        ClientPlayerPacket.register(SynchronizationResponsePacket.class);
        ClientPlayerPacket.register(PlayerIsAlivePacket.class);
        ClientPlayerPacket.register(ShellDestroyedPacket.class);
    }
}
