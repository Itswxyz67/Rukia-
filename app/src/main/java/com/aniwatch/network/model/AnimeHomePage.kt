package com.aniwatch.network.model

data class AnimeHomePage(
    val success: Boolean,
    val data: Data
) {
    data class Data(
        val genres: List<String>,
        val latestEpisodeAnimes: List<Anime>,
        val spotlightAnimes: List<SpotlightAnime>,
        val top10Animes: Top10Animes,
        val topAiringAnimes: List<Anime>,
        val topUpcomingAnimes: List<Anime>,
        val trendingAnimes: List<Anime>,
        val mostPopularAnimes: List<Anime>,
        val mostFavoriteAnimes: List<Anime>,
        val latestCompletedAnimes: List<Anime>
    )

    data class Anime(
        val id: String,
        val name: String,
        val poster: String,
        val type: String,
        val episodes: Episodes
    )

    data class SpotlightAnime(
        val id: String,
        val name: String,
        val jname: String,
        val poster: String,
        val description: String,
        val rank: Int,
        val otherInfo: List<String>,
        val episodes: Episodes
    )

    data class Episodes(
        val sub: Int,
        val dub: Int
    )

    data class Top10Animes(
        val today: List<Anime>,
        val month: List<Anime>,
        val week: List<Anime>
    )
}
