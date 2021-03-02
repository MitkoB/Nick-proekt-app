package com.example.nick.config;

import com.example.nick.service.CategoryService;
import com.example.nick.service.ExerciseService;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
public class DataHolder {
    //public static List<Exercise> exerciseList=new ArrayList<>();
    private final ExerciseService exerciseService;
    private final CategoryService categoryService;

    public DataHolder(ExerciseService exerciseService, CategoryService categoryService) {
        this.exerciseService = exerciseService;
        this.categoryService = categoryService;
    }

    @PostConstruct
    public void init() {
        this.categoryService.create("Врат", "Вежбите за вратот помагаат во борбата против тврд и вкочанет врат. " +
                        "Мускулите се зајакнуваат благодарение на ослободувањето и опуштањето на мускулите во вратот.",
                "https://i.pinimg.com/originals/0d/e3/14/0de31470ee503a68b5856a4a89019deb.jpg",
                "https://static.thenounproject.com/png/1786708-200.png");

        this.categoryService.create("Грб", "Специјално одбрани вежби кои се препорачани за лица со" +
                        " искривување на 'рбетот, неправилно држење на телото или болка во било кој предел на грбот и половината.",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTuNm5_iWY5fuJFMEgMR2R1DSWQDjVrUnT31Q&usqp=CAU",
                "https://img.freepik.com/free-vector/man-with-gesture-low-back-pain_81698-1496.jpg?size=626&ext=jpg");

        this.categoryService.create("Стомак", "Погледнете методи и вежби за зацврстување на стомакот кои поттикнуваат " +
                        "тренирање на попречните абдоминални мускули ги активираат околните мускули.",
                "https://clipartart.com/images/abdominals-clipart-8.jpg",
                "https://easydrawingguides.com/wp-content/uploads/2020/04/Abs-Step-09.png");

        this.categoryService.create("Раце", "Овие вежби се препорачуваат за лица кои имаат привремена парализа на рацете, " +
                        "болка во зглобовите или пак како помош при опоравување после некоја претрпена повреда во рацете.",
                "https://media.istockphoto.com/vectors/female-biceps-well-toned-elbowbent-arm-showing-progress-after-f" +
                        "itness-vector-id935265008?b=1&k=6&m=935265008&s=612x612&w=0&h=c5eZ3nwKtxMurhErY5E2xnU13KrDEwh2DL7WbeRhvG4=",
                "https://image.freepik.com/free-vector/vector-illustration-tiny-cute-cartoon-patient-man-character-broken-" +
                        "right-arm-gypsum-bandage-plastered-arm_52005-73.jpg");

        this.categoryService.create("Рамо", "Зголемувањето на силата на рамото може да ви помогне во ситуации кога треба " +
                        "да кренете работи над вашата глава. Вежбите за рамо и грб помагаат во исправен од и добро држење. ",
                "https://i.pinimg.com/474x/6f/d5/10/6fd510b38e3358b7ade0b0dac310f403.jpg",
                "https://i.pinimg.com/474x/6e/02/19/6e021922a33a597abd2f24c0db0cebac.jpg");

        this.categoryService.create("Дланки", "Сите овие вежби можат да ви помогнат да сте свесни за вашите" +
                        "прсти, дланка и зглобови. Со тоа се зголемува точноста, стабилноста и прецизноста во дланките.",
                "https://i.pinimg.com/736x/14/36/fd/1436fd11cca7dd3e349bf7171fb3c429.jpg",
                "https://i.pinimg.com/736x/10/ae/23/10ae232f59a2617d8f404821679cfc8c.jpg");

        this.categoryService.create("Нозе", "Вежбите за нозе се внимателно одбрани да помогнат на лица кои имаат проблеми како" +
                        " што се слабост во мускулите, неправилен развој во коските или пак привремен инвалидитет во нозете.",
                "https://igniterockford.files.wordpress.com/2010/11/legs.gif",
                "https://webstockreview.net/images/injury-clipart-knee-injury-5.jpg");

        this.categoryService.create("Стапала", "Ритамот на движењето е овозможен со често вежбање на стапалата. Стапалата " +
                        "стануваат силни а истовремено и мускулите во околината се зајакнуваат.",
                "https://st2.depositphotos.com/1466799/6373/v/380/depositphotos_63733423-stock-illustration-female-feet-with-red-pedicure.jpg",
                "https://media.istockphoto.com/vectors/doodle-baby-footprints-icon-in-vector-hand-drawn-baby-footprints-icon-vector-" +
                        "id1256139413?k=6&m=1256139413&s=612x612&w=0&h=eshVoZTZXexD60M6MayR2tGJdzH5lqlooNjDgzPWjU8=");

        this.categoryService.create("Истегнување", "Во оваа група на вежби се наоѓаат вежбите кои се препорачуваат за сите" +
                        " лица без разлика на попреченоста. Овие вежби помагаат во правилен развој и држење на телото како и за релаксација.",
                "https://i.pinimg.com/564x/bf/e1/6f/bfe16f33d55e59ea0842aacd64e475bb.jpg",
                "https://www.pngitem.com/pimgs/m/193-1930915_transparent-yoga-pose-png-yoga-kids-png-png.png");

        this.categoryService.create("Дишење", "Темпото и изворот на дишење претставува важен дел од вежбите" +
                        " на кој исто така треба да се обрне внимание. Вдиши-издиши техниките се во продолжение.",
                "https://coloringhome.com/coloring/Kcj/gLG/KcjgLGA9i.gif",
                "https://lh3.googleusercontent.com/proxy/x8w7MwQmSKAXEV7maICEU2i_o82lMmNbINL5S_PtElK90ap3MjHgmS" +
                        "jbr4c0m_DLrGBi8jgei3yCPxu8Om3gdqG-V-sI9UPi2m60EK7GRiiXiMCaSO6z0xs5ZnHY4bms5QimE-A");


        this.exerciseService.create("Навалување на врат напред", "Започнете ја секоја вежба со вратот во" +
                        " позиција на средната линија. Навалите на вратот ги истегнуваат мускулите на задниот дел на вратот. " +
                        " Овие вежби помагаат за намалување на тензија во вратот и овозможуваат добро држење." +
                        "За да го направите ова истегнување:\n \n" +
                        " 1. Застанете или седете во неутрална положба, а потоа повлечете ја брадата кон вратот.\n" +
                        " 2. Почувствувајте го истегнувањето во задниот дел на вратот.\n" +
                        " 3. Следно, нежно навалете ја главата нагоре кон таванот, продолжувајќи ја брадата нагоре и надвор.",
                1L, "https://www.verywellhealth.com/thmb/Uop5YvVeXJQLnEqgLT8_qU7ArdU=/1500x844/smart/" +
                        "filters:no_upscale()/Verywell-23-2696365-ChinToChest01-1897-599334f522fa3a0010622b87.gif", "", "10 пати");

        this.exerciseService.create("Завртување на глава на страна", "Вртењата на главата можат да го вратат опсегот " +
                "на движење, но на почетокот може да се извршуваат тешко и можно е да имате проблем во вртењето. Главата треба да биде " +
                "центрирана и да не биде навалена напред, назад или настрана. Оваа вежба можете да ја правите додека лежите рамно на грб" +
                " или седите. Да се сврти главата:\n \n" +
                " 1. Седнете или застанете во неутрална положба, а потоа свртете го лицето на едната страна за да погледнете преку рамото.\n" +
                " 2. Држете 5 секунди.\n" +
                " 3. Вратете ја главата во својата неутрална положба.\n" +
                " 4. Свртете ja повторно, овој пат на другата страна.\n", 1L, "https://www.verywellhealth.com/thmb/" +
                "taKjtLDviSbEU0yQnLvE2GGry2M=/1500x1000/filters:no_upscale():max_bytes(150000):strip_icc()/Verywell-23-2696365-SideToSide" +
                "01-1908-59933a3fd088c00013cd036f.gif", "", "10 пати");

        this.exerciseService.create("Навалување на врат на страна", "Да се навалете странично кон вратот:\n \n" +
                " 1. Нежно свиткајте го вратот во обид да го допрете левото уво на рамото.\n" +
                " 2. Запрете кога се чувствува истегнување во десната страна на вратот.\n" +
                " 3. Држете ја положбата 20 секунди.\n" +
                " 4. Вратете се на почетната позиција.\n" +
                " 5. Повторете го над истегнување уште четири пати.\n" +
                " 6. Нежно свиткајте го вратот во обид да го допрете десното уво на рамото.\n" +
                " 7. Запрете кога се чувствува истегнување во левата страна на вратот.\n" +
                " 8. Држете ја положбата 20 секунди.\n" +
                " 9. Вратете се на почетната позиција.\n" +
                " 10. Повторете го ова истегнување уште четири пати.", 1L, "https://www.verywellhealth.com/thmb/" +
                "CUJp9SsZLCevtke-YR1m-ts0mjM=/1500x0/filters:no_upscale():max_bytes(150000):strip_icc():format(webp)/" +
                "Verywell-23-2696365-EarToShoulder01-1912-59933a51d088c00013cd0562.gif", "", "10 пати");

        this.exerciseService.create("Подигање на карлица", "Наклонот на карлицата е вежба за секој што има болки во грбот, " +
                        "особено болка во долниот дел од грбот. Нè учи да ги користиме стомачните мускули на начин што го поддржува и издолжува " +
                        "долниот дел на грбот. За да ја направите вежбата:\n\n" +
                        " 1. Легнете на грб и свијте ги нозете во прав агол. \n" +
                        " 2. Подигнете ја карлицата колку што можете подалеку од подот и вдишете. \n" +
                        " 3. Држете 3-5 секунди.\n" +
                        " 4. Вратете ја карлицата во првобитната положба.", 2L,
                "https://www.verywellfit.com/thmb/bZu5_m_jqdBLpP02gh3UzixIBxg=/900x0/filters:no_upscale():max_bytes(150000):" +
                        "strip_icc():format(webp)/Verywell-01-2704746-Pelvic01-572-598b480703f4020010b122a6.gif",
                "", "5 пати");

        this.exerciseService.create("Лебедова поза", "Позата на лебедот ги зајакнува екстензорите на грбот." +
                        " Овие мускули се често слаби и претерано растегнати кај луѓе кои имаат болки во грбот.\n\n" +
                        " Изведете ја оваа вежба полека. За да ја направите" +
                        " вежбата:\n\n" +
                        " 1. Легнете со лицето надолу.\n" +
                        " 2. Држете ги рацете близу до телото додека со свиткани лакти и ги доведете рацете под рамената." +
                        " Рамената треба да бидат подалеку од ушите.\n" +
                        " 3. Исправете ги нозете. \n" +
                        " 4. Вдишете: Издолжете го 'рбетот, преку горниот дел од главата додека ги притискате подлактиците и " +
                        "рацете во подлогата за нагорен лак на горниот дел од телото. \n" +
                        " 5. Издишување: Вратете се во првобитна положба, издолжувајќи го 'рбетот додека торзото се враќа на подот.\n",
                2L, "https://www.verywellfit.com/thmb/acIEqUdf9GEPHvklQxadYit_bFw=/900x0/filters:no_upscale():max_bytes(150000)" +
                        ":strip_icc():format(webp)/Verywell-03-2704746-Swan01-597-598b483568e1a2001187323a.gif", "", "5 пати");

        this.exerciseService.create("Детска позиција", "За да ја направете оваа вежба следете ги следните чекори: \n" +
                        "1. Со рацете и колената на земја, спуштајте се надолу.\n" +
                        "2. Потпрете го стомакот на бутовите.\n" +
                        "3. Проширете ги рацете пред или заедно со телото со дланките свртени нагоре.\n" +
                        "4. Фокусирајте се на длабоко дишење и опуштање на сите области на напнатост или затегнатост.\n" +
                        "Држете ја оваа позиција до 1 минута.", 2L,
                "https://www.verywellfit.com/thmb/nP-iIWr5wNiyQIDJbWtf2se_d7Y=/900x0/filters:no_upscale():max_bytes(150000):" +
                        "strip_icc():format(webp)/Verywell-04-2704746-ChildsPose-598b48489abed50010aaeb62.gif",
                "", "5 пати");

        this.exerciseService.create("Абдоминално претискање", "Овие вежби се одлични за зајакнување на вашите основни " +
                        "мускули без да ставите премногу стрес на долниот дел на грбот и 'рбетот. Еве како правилно да вежбате:\n\n" +
                        " 1. Легнете на грб.\n" +
                        " 2. Свиткајте ги колената во удобна положба.\n" +
                        " 3. Ставете ги прстите зад главата или прекрстете ги рацете пред градите.\n" +
                        " 4. Свиткајте ја главата, рамената и горниот дел од грбот од подот\n" +
                        " 5. Држете го долниот дел на грбот во контакт со подот; треба да се кренете само неколку сантиметри.\n" +
                        " 6. Дишете додека станувате.\n" +
                        " 7. Држете ја оваа позиција три секунди.\n" +
                        " 8. Полека вратете се на почетната позиција.\n" +
                        "Ако чувствувате болка во грбот, консултирајте се со вашиот лекар или физикален терапевт.", 3L,
                "https://www.verywellhealth.com/thmb/b8cT6SqQhqMHikJ6DnJwpRzwb-4=/900x0/filters:no_upscale():max_bytes(150000):strip_" +
                        "icc():format(webp)/Verywell-1-2696610-AbdominalCrunch01-1853-5991f723af5d3a00114a1d7f.gif", "", "5 пати");

        this.exerciseService.create("Ниско подигање на ногата", "Ниското подигнување на ногата е предизвикувачки, " +
                "но ефикасен начин за зајакнување на мускулите на долниот дел на стомакот. Еве како ќе го направите тоа:\n\n" +
                " 1. Легнете на грб.\n" +
                " 2. Свиткајте ги колената до одреден степен што ви е пријатно. Колку се исправени нозете, толку потешка ќе биде вежбата.\n" +
                " 3. Подигнете ги стапалата околу 10 сантиметри нагоре.\n" +
                " 4. Полека (во истото движење како лак) вратете ги нозете / стапалата на подот.", 3L,
                "https://www.verywellhealth.com/thmb/d9fYaxa-b1bx8hAVEOpOLfhdvvg=/900x0/filters:no_upscale():max_bytes(150000):strip_icc()" +
                        ":format(webp)/Verywell-2-2696610-LowAbLegRaise01-1859-5991f74668e1a20011fdc4a1.gif", "", "5 пати");

        this.exerciseService.create("Извртено седење", "Овие извртувачки стомачни се одличен начин да ги внесете вашите " +
                "странични мускули во акција и да работите правилно. Еве како ги правите:\n\n" +
                " 1. Легнете на грб.\n" +
                " 2. Свиткајте ги колената во удобна положба.\n" +
                " 3. Свиткајте ги прстите зад главата\n" +
                " 4. Навиткајте ја главата, рамената, горниот и долниот дел на грбот од подот и аголот на левиот лакт кон десното колено.\n" +
                " 5. Држете ја оваа позиција 5 секунди.\n" +
                " 6. Полека вратете се на почетната позиција.\n" +
                " 7. Навиткајте ја главата, рамената, горниот и долниот дел на грбот од подот и аголот на десниот лакт кон левото колено.\n" +
                " 8. Држете ја оваа позиција 5 секунди.\n" +
                " 9. Полека вратете се на почетната позиција.\n", 3L, "https://www.verywellhealth.com/thmb/HESqCxN6r37VSmp" +
                "OkAByJX1DjQQ=/900x0/filters:no_upscale():max_bytes(150000):strip_icc():format(webp)/Verywell-3-2696610-TwistingSitups01-1890-" +
                "5991f7ba9abed50010ad9cc9.gif", "", "3-5 пати");

        this.exerciseService.create("Екстензија на зглоб", "За да ја направете оваа вежба следете ги следните чекори:\n" +
                        "1. Застанете исправено со исправени нозе раширени во ширина на рамото.\n" +
                        " 2. Испружете ги рацете напред и држете се за стол или маса.\n " +
                        "3. Држејќи ја десната нога исправена, подигајте ја левата нога назад без да го свиткате коленото.\n " +
                        "4. Подигнете ја колку што можете без да предизвикате" +
                        "непријатност, а потоа цврсто затегнете го задникот и држете ја оваа позиција 5 секунди. " +
                        "ПОВТОРЕТЕ го ова истегнување 5-10 пати на секоја нога.",
                4L, "https://cdn-prod.medicalnewstoday.com/content/images/articles/325/325029/hip-extension-gif.gif",
                "https://cdn-prod.medicalnewstoday.com/content/images/articles/325/325029/hip-extension-gif.gif", "5-10 пати");

        this.exerciseService.create("Двојна ротација на колк", "За да ја направете оваа вежба следете ги следните чекори: \n" +
                        "1. Легнете рамно на грбот.\n" +
                        " 2. Потоа, свиткајте ги колената и доведете ги кон телото додека стапалата не бидат рамни на подот.\n" +
                        "3.Нежно завртете ги колената налево, спуштајќи ги кон подот.\n " +
                        "4. Свртете ја главата кон лицето надесно, додека држите ги рамената кон подот." +
                        "Држете ја оваа позиција 20-30 секунди.\n" +
                        "5. Полека вратете ги и главата и колената во почетната позиција.\n" +
                        "Повторете го на спротивната страна.", 4L,
                "https://thumbs.gfycat.com/WhiteWeepyGermanspitz-small.gif",
                "https://thumbs.gfycat.com/WhiteWeepyGermanspitz-small.gif", "1-5 пати");

        this.exerciseService.create("Military press", "За да ја направете оваа вежба следете ги следните чекори: \n" +
                        "1. Со дланките свртени напред, држете тегови над секое рамо, приближно во висина на брадата.\n" +
                        "2. Теговите дигајте ги над глава.\n" +
                        "3. Држете ги неколку секунди и спуштете ги повторно во почетна позиција.\n"
                , 8L, "https://post.healthline.com/wp-content/uploads/2020/05/400x400_Try_This_5_Free_" +
                        "Weight_Exercises_to_Consider_and_Why_You_Should_Overhead_Shoulder_Press.gif",
                "https://post.healthline.com/wp-content/uploads/2020/05/400x400_Try_This_5_Free" +
                        "_Weight_Exercises_to_Consider_and_Why_You_Should_Overhead_Shoulder_Press.gif", "15 пати");

        this.exerciseService.create("Lateral raise", "За да ја направете оваа вежба следете ги следните чекори: \n" +
                        "1. Застанете или седете со рацете настрана и со тег во секоја рака.\n" +
                        "2. Со дланките свртени кон телото и лаковите малку свиткани, подигнете ги тегови, така што рацете ќе" +
                        " бидат паралелни со подот. Треба да направите Т-форма.\n" +
                        "3. Полека спуштете ги тегови до почетната позиција.\n"
                , 8L,
                "http://www.lifetime60day.com/wp-content/uploads/2017/12/Lateral-Raise.gif",
                "http://www.lifetime60day.com/wp-content/uploads/2017/12/Lateral-Raise.gif", "15 пати");

        this.exerciseService.create("Quad stretch", "За да ја направете оваа вежба следете ги следните чекори: \n" +
                        "1. Застанете со вашата страна кон ѕидот, ставајќи рака на ѕидот за рамнотежа.\n" +
                        "2. Држете ја надворешната нога со надворешната рака и подигнете ја ногата нагоре кон задниот крај," +
                        " држејќи ги бутовите и колената заедно.\n" +
                        "3. Држете за циклус на релаксирано дишење, а потоа сторете го истото за другата нога.\n"
                , 6L,
                "https://thumbs.gfycat.com/DeliriousFearfulIslandcanary-small.gif",
                "https://thumbs.gfycat.com/DeliriousFearfulIslandcanary-small.gif", "10 пати на секоја нога");

        this.exerciseService.create("Inner thigh stretch", "За да ја направете оваа вежба следете ги следните чекори: \n" +
                        "1. Застанете со многу широк став. \n" +
                        "2. Свиткајте го десното колено додека го менувате целото тело десно додека не почувствувате истегнување на " +
                        "левата внатрешна нога.\n" +
                        "3. Издишете, вметнете ја брадата во градите и заоблете го 'рбетот кон таванот.\n" +
                        "Правете 1/2 минути.", 6L,
                "https://thumbs.gfycat.com/DeterminedConcernedAmurstarfish-small.gif",
                "https://thumbs.gfycat.com/DeterminedConcernedAmurstarfish-small.gif", "10 пати на секоја нога");

        this.exerciseService.create("Cobra stretch", "За да ја направете оваа вежба следете ги следните чекори: \n" +
                        "1. Легнете на стомак и ставете ги рацете рамно под рамената.\n" +
                        "2. Свиткајте ги лактите за вашите страни и нежно подигнете ја главата и градите, држејќи ги колковите " +
                        "и препоните на креветот.\n" +
                        "3. Не заборавајте да ги опуштите вратот и рамената. Држете го истегнувањето 15-20 секунди " +
                        "и кога сте подготвени, нежно спуштете се надолу.\n"
                , 9L,
                "https://images.squarespace-cdn.com/content/v1/5b900adb4cde7a0e7998e50c/1579210508938-IQJOJHAPLJ59KGPKDFKS/ke17Z" +
                        "wdGBToddI8pDm48kLPswmMOqQZ9-Q6KHLjvbpZ7gQa3H78H3Y0txjaiv_0fDoOvxcdMmMKkDsyUqMSsMWxHk725yiiHCCLfrh8O1z5QPOohDIaIelj" +
                        "MHgDF5CVlOqpeNLcJ80NK65_fV7S1UVTQf06wQztZgT3ocQ_Nttc9pRe5bgfSgFgLIpbw9lM5m7cT0R_dexc_UL_zbpz6JQ/Cobra-top-title.gif",
                "https://images.squarespace-cdn.com/content/v1/5b900adb4cde7a0e7998e50c/1579210508938-IQJOJHAPLJ59KGPKDFKS/ke17Z" +
                        "wdGBToddI8pDm48kLPswmMOqQZ9-Q6KHLjvbpZ7gQa3H78H3Y0txjaiv_0fDoOvxcdMmMKkDsyUqMSsMWxHk725yiiHCCLfrh8O1z5QPOohDIaIelj" +
                        "MHgDF5CVlOqpeNLcJ80NK65_fV7S1UVTQf06wQztZgT3ocQ_Nttc9pRe5bgfSgFgLIpbw9lM5m7cT0R_dexc_UL_zbpz6JQ/Cobra-top-title.gif", "2 пати");

        this.exerciseService.create(" Spinal twist", "За да ја направете оваа вежба следете ги следните чекори: \n" +
                        "1. Лежејќи на грб, подигнете го едното колено и нежно превртете го на спротивната страна. Осигурете се дека " +
                        "и двете рамена остануваат во контакт со подлогата постојано..\n" +
                        "2. Треба да го почувствувате истегнувањето на страните на горниот дел од телото и долниот дел на грбот.\n" +
                        "3. Дишете длабоко и повторете го на спротивната страна.\n"
                , 9L,
                "https://www.verywellfit.com/thmb/3TEbXpzrpMJwy0A4RlhA3zQCQ04=/1500x844/smart/filters:no_upscale()/" +
                        "Verywell-20-4023748-SpinalTwist01-1729-5995b536845b340010c016cf.gif",
                "https://www.verywellfit.com/thmb/3TEbXpzrpMJwy0A4RlhA3zQCQ04=/1500x844/smart/filters:no_upscale()" +
                        "/Verywell-20-4023748-SpinalTwist01-1729-5995b536845b340010c016cf.gif", "по 30 секунди на секоја страна");

    }
}
