var firebaseConfig = {
    apiKey: "",
    authDomain: "application-7d220.firebaseapp.com",
    databaseURL: "https://application-7d220.firebaseio.com",
    projectId: "application-7d220",
    storageBucket: "application-7d220.appspot.com",
    messagingSenderId: "",
    appId: "1:863585486332:web:aac9f7f295e64f77eb9e79"
};
// Initialize Firebase
firebase.initializeApp(firebaseConfig);

//Reference Messages collection
let messagesRef = firebase.database().ref('messages');

//Listen for form submit
document.getElementById('contactform').addEventListener('submit', submitForm);

//Submit form
function submitForm(e) {
    e.preventDefault();

    //Get Values
    let name = getInputVal('name');
    let email = getInputVal('email');
    let company = getInputVal('company');
    let message = getInputVal('message');

    //Save Message
    saveMessage(name, email, company, message);

    //Show alert
    document.querySelector('.alert-success').style.display = 'block';

    //Hide alert after 3 seconds
    setTimeout(function () {
        document.querySelector('.alert-success').style.display = 'none';
    }, 3000);

    document.getElementById('contactform').reset();
}

//Function to get form values
function getInputVal(id) {
    return document.getElementById(id).value;
}

//Save message to firebase
function saveMessage(name, email, company, message) {
    let newMessageRef = messagesRef.push();
    newMessageRef.set({
        name: name,
        email: email,
        company: company,
        message: message
    });
}