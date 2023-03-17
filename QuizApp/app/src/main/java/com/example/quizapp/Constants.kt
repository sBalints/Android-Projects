package com.example.quizapp

object Constants {

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS : String = "total_questions"
    const val CORRECT_ANSWERS : String = "correct_answers"



    fun getQuestions(): ArrayList<Questions>{
        val questionsList = ArrayList<Questions>()

        val que1 = Questions(
            1, "What country does this flag belong to?",
            R.drawable.ic_flag_of_argentina,
            "Angola","Argentina",
            "Australia", "Armenia",
            2
        )
        questionsList.add(que1)
        //2
        val que2 = Questions(
            2, "What country does this flag belong to?",
            R.drawable.ic_flag_of_australia,
            "Bolivia","England",
            "Australia", "Spain",
            3
        )
        questionsList.add(que2)
        //3
        val que3 = Questions(
            3, "What country does this flag belong to?",
            R.drawable.ic_flag_of_belgium,
            "Nigeria","Belgium",
            "Netherlands", "Germany",
            2
        )
        questionsList.add(que3)
        //4
        val que4 = Questions(
            4, "What country does this flag belong to?",
            R.drawable.ic_flag_of_brazil,
            "Portugal","Bulgaria",
            "Spain", "Brazil",
            4
        )
        questionsList.add(que4)
        //5
        val que5 = Questions(
            5, "What country does this flag belong to?",
            R.drawable.ic_flag_of_denmark,
            "Andorra","Norway",
            "Finland", "Denmark",
            4
        )
        questionsList.add(que5)
        //6
        val que6 = Questions(
            6, "What country does this flag belong to?",
            R.drawable.ic_flag_of_fiji,
            "Filipe-Islands","Romania",
            "Fiji", "Austria",
            3
        )
        questionsList.add(que6)
        //7
        val que7 = Questions(
            7, "What country does this flag belong to?",
            R.drawable.ic_flag_of_india,
            "Bangladesh","India",
            "Chile", "Peru",
            2
        )
        questionsList.add(que7)
        //8
        val que8 = Questions(
            8, "What country does this flag belong to?",
            R.drawable.ic_flag_of_germany,
            "Germany","Russia",
            "Estonia", "Poland",
            1
        )
        questionsList.add(que8)
        //9
        val que9 = Questions(
            9, "What country does this flag belong to?",
            R.drawable.ic_flag_of_new_zealand,
            "Australia","Hungary",
            "Slovakia", "New Zealand",
            4
        )
        questionsList.add(que9)
        //10
        val que10 = Questions(
            10, "What country does this flag belong to?",
            R.drawable.ic_flag_of_kuwait,
            "Congo","Kuwait",
            "Letonia", "Switzerland",
            2
        )
        questionsList.add(que10)
        return questionsList
    }

}