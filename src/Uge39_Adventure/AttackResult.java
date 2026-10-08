package Uge39_Adventure;
/*
    Mulige udfald af at angribe:
    intet våben udstyret, våbnet kan ikke bruges mere, den navngivne fjende findes ikke,
    ingen fjende der (slog i tom luft), fjenden døde, fjenden overlevede og slog tilbage,
    fjenden overlevede men kunne ikke ramme, eller spilleren døde af modangrebet.
 */
public enum AttackResult {NOT_WEAPON_EQUIP, OUT_OF_USES, NO_SUCH_ENEMY, HIT_AIR,
    ENEMY_DIED, ENEMY_HIT_BACK, ENEMY_COULD_NOT_HIT, PLAYER_DIED}
