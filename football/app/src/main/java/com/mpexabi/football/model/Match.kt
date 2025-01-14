package com.mpexabi.football.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import java.io.Serializable

@Parcelize
data class Match (
    val dateEvent: String,
    val idAwayTeam: String,
    val idEvent: String,
    val idHomeTeam: String,
    val idLeague: String,
    val idSoccerXML: String,
    val intAwayScore: String,
    val intAwayShots: String,
    val intHomeScore: String,
    val intHomeShots: String,
    val intRound: String,
    val intSpectators: String,
    val strAwayFormation: String,
    val strAwayGoalDetails: String,
    val strAwayLineupDefense: String,
    val strAwayLineupForward: String,
    val strAwayLineupGoalkeeper: String,
    val strAwayLineupMidfield: String,
    val strAwayLineupSubstitutes: String,
    val strAwayRedCards: String,
    val strAwayTeam: String,
    val strAwayYellowCards: String,
    val strBanner: String,
    val strCircuit: String,
    val strCity: String,
    val strCountry: String,
    val strDate: String,
    val strDescriptionEN: String,
    val strEvent: String,
    val strFanart: String,
    val strFilename: String,
    val strHomeFormation: String,
    val strHomeGoalDetails: String,
    val strHomeLineupDefense: String,
    val strHomeLineupForward: String,
    val strHomeLineupGoalkeeper: String,
    val strHomeLineupMidfield: String,
    val strHomeLineupSubstitutes: String,
    val strHomeRedCards: String,
    val strHomeTeam: String,
    val strHomeYellowCards: String,
    val strLeague: String,
    val strLocked: String,
    val strMap: String,
    val strPoster: String,
    val strResult: String,
    val strSeason: String,
    val strSport: String,
    val strThumb: String,
    val strTime: String

) : Parcelable, Serializable