function abrir_menu(){
    let main = document.getElementById("corpo");
    let menu = criar_menu();
    main.appendChild(menu);
    return
}


function criar_menu(){
    let links = ["Logo.png","Início","Cadastrar","Consultar","Deletar"]
    let menu = document.createElement("div");
    for(let i = 0; i<links.length;i++){
        if(links[i] == "Logo.png"){
            let link = document.createElement("a");    
        }
        let link = document.createElement("a");
        link.textContent = links[i];
        menu.appendChild(link);
    }
    menu.className = "menu";
    return menu;
}