$(".header-jumbotron").click(function(e){
    let target = e.target;
    let isMobileNavButtonClicked =
        $(target).hasClass("navbar-toggler");

    if(isMobileNavButtonClicked){
        return $(".header-jumbotron").hide(".header-jumbotron");
    }
});