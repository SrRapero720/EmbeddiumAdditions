package me.srrapero720.embeddium.additions;

import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.MarkerManager;

@Mod(EmbeddiumAdditions.ID)
public class EmbeddiumAdditions {
    public static final String ID = "embeddium_additions";
    public static final Logger LOGGER = LogManager.getLogger(ID);
    public static final Marker IT = MarkerManager.getMarker("Main");

    public EmbeddiumAdditions() {
        LOGGER.info(IT, "Starting Embeddium++Additions");
    }
}
