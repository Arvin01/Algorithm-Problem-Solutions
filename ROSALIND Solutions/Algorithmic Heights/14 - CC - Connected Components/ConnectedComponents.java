import java.util.*;
public class ConnectedComponents {
  public static void main( String[] args ) {
    String[] graph = {"935 1145",
"373 857",
"858 277",
"733 95",
"323 294",
"82 898",
"406 635",
"501 892",
"117 619",
"677 334",
"354 161",
"881 897",
"304 854",
"186 110",
"461 147",
"388 656",
"453 577",
"413 260",
"856 704",
"808 762",
"704 576",
"478 603",
"525 895",
"428 678",
"865 313",
"663 234",
"560 152",
"456 862",
"399 256",
"822 357",
"735 73",
"561 98",
"141 252",
"609 150",
"401 772",
"742 749",
"610 282",
"614 278",
"726 883",
"159 53",
"711 870",
"819 510",
"918 606",
"676 509",
"49 28",
"526 252",
"329 418",
"500 715",
"722 780",
"373 157",
"191 186",
"251 332",
"847 230",
"96 234",
"580 483",
"676 408",
"668 621",
"276 932",
"364 311",
"23 754",
"573 443",
"74 127",
"619 862",
"342 598",
"250 704",
"321 400",
"594 868",
"473 620",
"713 825",
"598 840",
"42 67",
"340 646",
"624 135",
"277 398",
"510 347",
"733 543",
"13 578",
"792 690",
"789 889",
"596 53",
"520 587",
"749 47",
"11 156",
"24 132",
"718 763",
"853 687",
"469 106",
"411 907",
"775 426",
"712 860",
"48 110",
"360 229",
"146 210",
"647 367",
"179 306",
"363 561",
"337 137",
"705 759",
"106 688",
"629 220",
"125 917",
"615 658",
"788 590",
"869 878",
"487 853",
"311 274",
"273 81",
"495 618",
"933 491",
"903 844",
"540 138",
"753 542",
"855 830",
"751 353",
"569 256",
"935 229",
"2 340",
"879 39",
"408 300",
"385 477",
"852 303",
"760 146",
"746 291",
"933 541",
"349 720",
"661 693",
"238 732",
"672 752",
"647 719",
"34 200",
"293 845",
"479 305",
"712 809",
"386 128",
"261 788",
"777 203",
"77 466",
"441 5",
"536 116",
"670 856",
"807 574",
"212 247",
"264 269",
"348 187",
"804 467",
"158 652",
"824 144",
"829 522",
"548 615",
"233 683",
"315 848",
"514 431",
"828 228",
"61 162",
"927 279",
"258 761",
"76 541",
"708 752",
"746 60",
"595 766",
"352 572",
"870 807",
"879 578",
"270 645",
"405 553",
"781 623",
"645 824",
"502 83",
"719 637",
"755 812",
"163 683",
"639 441",
"75 376",
"90 683",
"222 50",
"794 761",
"887 249",
"463 812",
"532 826",
"788 422",
"455 355",
"404 510",
"19 900",
"428 236",
"266 147",
"602 898",
"707 464",
"847 349",
"328 637",
"185 168",
"672 872",
"11 146",
"744 473",
"895 196",
"371 573",
"537 902",
"70 160",
"233 444",
"133 500",
"670 785",
"757 106",
"54 821",
"425 543",
"147 330",
"217 163",
"799 673",
"178 608",
"639 422",
"446 69",
"392 663",
"664 222",
"804 370",
"245 252",
"13 847",
"744 433",
"642 590",
"777 491",
"313 302",
"450 844",
"605 824",
"623 435",
"734 883",
"401 921",
"883 613",
"365 18",
"785 340",
"406 20",
"248 328",
"833 918",
"838 61",
"406 338",
"570 372",
"799 755",
"270 345",
"722 194",
"85 131",
"603 391",
"932 859",
"350 790",
"560 121",
"385 544",
"566 832",
"503 178",
"72 825",
"799 101",
"692 633",
"810 74",
"509 617",
"406 529",
"617 694",
"807 57",
"523 794",
"791 197",
"633 46",
"42 250",
"384 169",
"621 770",
"928 247",
"103 297",
"244 570",
"756 281",
"222 512",
"928 532",
"640 909",
"437 35",
"70 922",
"295 133",
"789 138",
"273 524",
"443 783",
"35 154",
"519 390",
"166 184",
"119 356",
"140 907",
"205 152",
"425 207",
"438 475",
"161 750",
"291 74",
"485 905",
"542 278",
"115 786",
"931 912",
"127 406",
"587 241",
"78 821",
"873 325",
"412 934",
"203 913",
"10 816",
"77 365",
"109 792",
"14 254",
"841 2",
"853 833",
"790 400",
"24 89",
"859 775",
"219 561",
"103 517",
"469 811",
"454 375",
"432 236",
"674 164",
"262 677",
"691 488",
"909 353",
"340 695",
"222 666",
"371 124",
"288 858",
"907 232",
"854 300",
"781 869",
"357 56",
"748 728",
"852 157",
"236 396",
"697 501",
"669 708",
"212 800",
"786 43",
"12 22",
"451 526",
"524 488",
"446 443",
"569 29",
"143 557",
"5 138",
"70 764",
"400 392",
"553 726",
"928 711",
"469 285",
"88 729",
"788 298",
"832 532",
"72 840",
"86 253",
"721 253",
"545 39",
"586 898",
"15 528",
"594 645",
"853 323",
"761 69",
"664 482",
"832 264",
"525 907",
"15 501",
"864 151",
"200 554",
"569 679",
"274 164",
"885 901",
"435 279",
"117 614",
"259 273",
"776 474",
"922 281",
"531 607",
"507 641",
"10 683",
"836 40",
"431 788",
"817 39",
"230 127",
"675 907",
"714 722",
"516 397",
"240 566",
"487 671",
"130 931",
"538 401",
"567 422",
"842 333",
"771 238",
"193 809",
"231 212",
"769 597",
"749 663",
"570 480",
"341 156",
"9 66",
"848 491",
"154 54",
"507 464",
"365 561",
"674 289",
"334 501",
"442 391",
"364 458",
"907 306",
"652 568",
"37 40",
"787 594",
"609 566",
"917 96",
"515 493",
"566 507",
"116 610",
"160 627",
"821 59",
"410 67",
"301 752",
"698 556",
"599 675",
"463 232",
"18 636",
"510 601",
"727 902",
"641 299",
"851 862",
"255 75",
"521 410",
"204 239",
"118 514",
"600 317",
"594 130",
"449 240",
"744 224",
"796 553",
"476 703",
"119 99",
"288 752",
"318 488",
"22 168",
"462 404",
"24 484",
"183 120",
"582 48",
"430 189",
"422 110",
"351 28",
"464 107",
"571 116",
"720 586",
"493 664",
"352 358",
"164 154",
"176 734",
"357 175",
"319 613",
"203 314",
"903 690",
"137 317",
"888 664",
"868 281",
"342 732",
"912 563",
"582 870",
"207 743",
"265 493",
"676 679",
"223 490",
"267 900",
"46 645",
"111 441",
"645 690",
"611 834",
"400 535",
"408 185",
"373 681",
"809 571",
"923 66",
"262 606",
"379 92",
"298 828",
"907 614",
"337 271",
"612 317",
"621 550",
"171 746",
"774 711",
"182 280",
"122 545",
"729 813",
"268 666",
"110 185",
"184 368",
"738 212",
"582 629",
"508 565",
"207 139",
"539 714",
"118 882",
"193 230",
"180 294",
"733 131",
"748 477",
"74 827",
"705 127",
"399 764",
"23 146",
"667 573",
"68 778",
"763 58",
"611 598",
"300 898",
"777 615",
"535 648",
"198 128",
"473 460",
"199 857",
"215 404",
"284 239",
"564 774",
"581 864",
"214 395",
"4 450",
"868 831",
"858 866",
"124 390",
"443 566",
"873 730",
"625 604",
"762 311",
"54 388",
"620 233",
"634 61",
"194 274",
"466 347",
"836 315",
"191 20",
"52 330",
"679 574",
"621 871",
"519 752",
"346 612",
"631 218",
"431 99",
"407 300",
"114 333",
"822 682",
"320 642",
"549 30",
"258 810",
"712 931",
"266 4",
"626 537",
"227 864",
"57 165",
"891 594",
"450 190",
"606 823",
"919 926",
"568 751",
"826 930",
"254 139",
"870 404",
"262 50",
"349 194",
"710 920",
"178 265",
"776 476",
"242 744",
"632 96",
"454 547",
"504 330",
"503 857",
"365 47",
"583 117",
"26 569",
"139 190",
"110 798",
"182 373",
"888 388",
"643 904",
"134 404",
"33 232",
"536 120",
"530 757",
"96 924",
"14 87",
"247 775",
"390 216",
"256 342",
"582 146",
"224 917",
"53 705",
"808 159",
"537 441",
"477 673",
"907 687",
"483 561",
"582 879",
"388 75",
"117 44",
"320 584",
"873 692",
"899 726",
"157 499",
"732 317",
"331 479",
"788 798",
"924 360",
"368 54",
"251 682",
"8 797",
"647 703",
"4 792",
"54 331",
"405 908",
"91 361",
"202 898",
"233 909",
"803 313",
"12 480",
"698 449",
"280 668",
"784 424",
"353 206",
"241 289",
"68 336",
"481 709",
"897 419",
"418 514",
"187 712",
"569 552",
"48 568",
"919 792",
"452 326",
"232 824",
"546 435",
"258 608",
"86 625",
"648 224",
"111 329",
"315 275",
"559 449",
"389 910",
"453 624",
"890 196",
"850 873",
"532 37",
"519 299",
"245 812",
"438 479",
"349 69",
"464 615",
"551 64",
"801 867",
"661 249",
"77 622",
"595 602",
"686 647",
"781 655",
"814 219",
"901 57",
"811 876",
"917 383",
"32 293",
"36 803",
"500 848",
"542 673",
"674 1",
"790 760",
"354 297",
"717 205",
"671 800",
"641 656",
"636 387",
"16 705",
"40 61",
"608 714",
"827 47",
"798 740",
"3 314",
"623 709",
"442 270",
"45 374",
"498 480",
"914 86",
"373 662",
"547 887",
"362 493",
"569 198",
"185 26",
"50 272",
"251 74",
"605 706",
"285 532",
"69 379",
"353 839",
"87 443",
"231 377",
"712 261",
"481 372",
"834 668",
"64 321",
"748 290",
"316 927",
"171 49",
"905 174",
"824 540",
"769 493",
"916 673",
"707 830",
"779 157",
"894 323",
"14 239",
"275 707",
"883 150",
"132 728",
"351 88",
"699 834",
"844 469",
"513 144",
"468 294",
"702 859",
"413 209",
"99 50",
"564 370",
"350 53",
"129 343",
"615 333",
"287 847",
"687 412",
"335 640",
"745 350",
"263 554",
"606 250",
"168 497",
"521 165",
"406 74",
"616 101",
"497 368",
"384 122",
"738 144",
"273 795",
"574 334",
"917 18",
"880 291",
"710 326",
"29 821",
"434 582",
"579 60",
"608 617",
"653 71",
"113 795",
"390 293",
"737 543",
"151 499",
"615 245",
"322 41",
"890 24",
"538 926",
"934 630",
"480 411",
"126 573",
"79 257",
"383 86",
"596 444",
"676 379",
"541 824",
"478 532",
"737 202",
"789 757",
"440 68",
"321 126",
"775 375",
"439 466",
"434 439",
"502 52",
"178 854",
"385 794",
"538 506",
"511 814",
"920 325",
"258 628",
"879 687",
"330 73",
"663 378",
"363 239",
"628 785",
"836 862",
"595 734",
"312 290",
"870 467",
"836 522",
"737 120",
"742 370",
"588 779",
"259 896",
"252 151",
"111 585",
"235 508",
"70 544",
"861 243",
"141 765",
"159 116",
"379 284",
"868 107",
"292 582",
"31 860",
"314 280",
"122 78",
"692 281",
"799 617",
"479 484",
"828 458",
"205 484",
"247 840",
"311 119",
"551 101",
"86 617",
"451 489",
"445 322",
"659 515",
"280 279",
"106 602",
"900 597",
"231 379",
"301 767",
"504 834",
"174 376",
"502 534",
"877 910",
"693 764",
"382 386",
"654 77",
"708 462",
"614 660",
"16 571",
"869 47",
"392 33",
"414 229",
"668 32",
"169 69",
"928 488",
"892 25",
"588 86",
"178 748",
"189 358",
"636 176",
"658 310",
"347 859",
"878 542",
"899 330",
"350 834",
"246 79",
"896 754",
"701 267",
"237 273",
"678 791",
"163 915",
"899 710",
"286 548",
"27 916",
"442 18",
"573 689",
"95 157",
"546 73",
"465 10",
"792 5",
"671 858",
"647 466",
"105 170",
"509 833",
"19 66",
"606 144",
"557 702",
"765 195",
"50 857",
"859 827",
"742 319",
"452 205",
"874 37",
"236 298",
"261 773",
"718 453",
"906 586",
"522 820",
"120 776",
"599 886",
"264 917",
"461 533",
"556 210",
"287 365",
"804 565",
"101 796",
"634 67",
"658 148",
"777 336",
"901 688",
"619 672",
"339 425",
"146 108",
"141 675",
"477 606",
"638 303",
"642 494",
"260 561",
"336 450",
"301 806",
"596 873",
"48 634",
"910 821",
"186 775",
"333 425",
"904 763",
"494 162",
"821 365",
"732 344",
"32 97",
"869 905",
"732 575",
"358 893",
"122 674",
"474 744",
"895 452",
"559 702",
"441 433",
"230 704",
"383 108",
"238 595",
"236 159",
"871 485",
"545 9",
"481 508",
"571 805",
"469 81",
"289 459",
"352 637",
"360 843",
"345 503",
"770 743",
"540 805",
"206 895",
"848 490",
"927 818",
"643 79",
"896 142",
"809 694",
"232 394",
"513 580",
"767 212",
"527 776",
"122 458",
"134 379",
"346 848",
"862 722",
"405 722",
"695 786",
"163 899",
"556 418",
"182 34",
"311 720",
"898 860",
"756 714",
"695 120",
"573 383",
"802 427",
"59 426",
"802 714",
"602 840",
"801 134",
"334 789",
"769 162",
"630 896",
"422 709",
"520 708",
"324 509",
"517 73",
"340 748",
"628 825",
"234 484",
"157 769",
"295 497",
"121 536",
"50 155",
"654 792",
"522 249",
"757 210",
"647 190",
"429 144",
"934 859",
"208 526",
"552 912",
"832 189",
"183 231",
"580 384",
"177 65",
"20 279",
"402 446",
"95 136",
"917 885",
"79 66",
"147 605",
"209 787",
"770 424",
"688 61",
"445 320",
"366 838",
"49 34",
"675 489",
"99 211",
"687 818",
"135 401",
"528 430",
"445 219",
"163 740",
"452 862",
"545 596",
"550 78",
"615 148",
"12 85",
"284 132",
"114 908",
"754 610",
"559 244",
"625 445",
"373 508",
"336 756",
"324 144",
"388 378",
"575 56",
"737 105",
"195 880",
"879 590",
"84 59",
"363 141",
"885 559",
"597 896",
"292 8",
"813 101",
"95 826",
"223 369",
"786 349",
"485 858",
"682 905",
"211 630",
"108 625",
"607 885",
"355 740",
"883 501",
"252 446",
"17 486",
"154 801",
"699 120",
"526 615",
"501 395",
"863 880",
"423 167",
"868 507",
"537 480",
"32 229",
"222 720",
"554 634",
"94 530",
"662 479",
"327 567",
"532 90",
"228 775",
"238 2",
"758 23",
"902 605",
"154 385",
"504 582",
"526 755",
"410 250",
"220 838",
"121 922",
"674 266",
"385 402",
"799 726",
"419 41",
"218 548",
"568 596",
"245 556",
"817 155",
"790 511",
"145 256",
"365 298",
"752 707",
"852 845",
"810 5",
"543 359",
"808 251",
"54 662",
"785 823",
"488 821",
"707 459",
"478 157",
"322 119",
"529 885",
"153 844",
"313 225",
"60 347",
"461 531",
"380 13",
"412 908",
"196 256",
"46 187",
"598 793",
"594 566",
"262 903",
"463 738",
"404 450",
"677 876",
"502 90",
"620 540",
"547 11",
"765 832",
"292 80",
"572 821",
"242 688",
"672 423",
"907 449",
"730 849",
"658 415",
"742 599",
"378 70",
"804 459",
"674 839",
"273 389",
"640 896",
"929 793",
"722 249",
"708 75",
"679 817",
"176 840",
"434 206",
"589 59",
"549 281",
"881 147",
"387 220",
"871 178",
"33 129",
"690 417",
"698 88",
"819 929",
"434 784",
"175 446",
"434 187",
"141 38",
"425 93",
"611 73",
"251 324",
"347 235",
"344 692",
"857 66",
"605 175",
"382 248",
"239 593"};
    System.out.println(connectedComponents(graph));
  }
  
  public static int connectedComponents( String[] g ) {
    int n = Integer.parseInt(g[0].split(" ")[0]);
    ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    for(int i = 0; i <= n; ++i) {
      graph.add(new ArrayList<>()); // graph[0] is dummy
    }
    for(int i = 1; i < g.length; ++i) {
      String[] parts = g[i].split(" ");
      int a = Integer.parseInt(parts[0]);
      int b = Integer.parseInt(parts[1]);
      graph.get(a).add(b);
      graph.get(b).add(a); // undirected graph
    }
    boolean[] visited = new boolean[n];
    int count = 0;
    for(int i = 1; i <= n; ++i) {
      if(!visited[i-1]) {
        ++count;
        DFS(i,graph,visited);
      }
    }
    return count;
  }
  
  public static void DFS( int curr, ArrayList<ArrayList<Integer>> graph, boolean[] visited ) {
    visited[curr-1] = true;
    ArrayList<Integer> n = graph.get(curr);
    for(int i = 0; i < n.size(); ++i) {
      int next = n.get(i);
      if(!visited[next-1]) {
        DFS(next,graph,visited);
      }
    }
  }
}