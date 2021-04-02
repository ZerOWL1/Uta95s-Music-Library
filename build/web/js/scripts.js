/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//contact
const inputs = document.querySelectorAll(".input");

function focusFunc() {
    let parent = this.parentNode;
    parent.classList.add("focus");
}
function blurFunc() {
    let parent = this.parentNode;
    if (this.value == "") {
        parent.classList.remove("focus");
    }
}
inputs.forEach(input => {
    input.addEventListener("focus", focusFunc);
    input.addEventListener("blur", blurFunc);
});


//delete confirm
function ConfirmDelete() {
    var x = confirm("Are you sure you want to delete?");
    if (x)
        return true;
    else
        return false;
}



